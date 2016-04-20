/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.sql;

import com.microsoft.windowsazure.core.OperationResponse;
import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.management.sql.models.FirewallRuleCreateParameters;
import com.microsoft.windowsazure.management.sql.models.FirewallRuleCreateResponse;
import com.microsoft.windowsazure.management.sql.models.FirewallRuleGetResponse;
import com.microsoft.windowsazure.management.sql.models.FirewallRuleListResponse;
import com.microsoft.windowsazure.management.sql.models.FirewallRuleUpdateParameters;
import com.microsoft.windowsazure.management.sql.models.FirewallRuleUpdateResponse;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.concurrent.Future;

/**
* The Azure SQL Database Management API includes operations for managing the
* server-level Firewall Rules for Azure SQL Database Servers. You cannot
* manage the database-level firewall rules using the Azure SQL Database
* Management API; they can only be managed by running the Transact-SQL
* statements against the master or individual user databases.
*/
public interface FirewallRuleOperations {
    /**
    * Adds a new server-level Firewall Rule for an Azure SQL Database Server.
    *
    * @param serverName Required. The name of the Azure SQL Database Server to
    * which this rule will be applied.
    * @param parameters Required. The parameters for the Create Firewall Rule
    * operation.
    * @throws ParserConfigurationException Thrown if there was an error
    * configuring the parser for the response body.
    * @throws SAXException Thrown if there was an error parsing the response
    * body.
    * @throws TransformerException Thrown if there was an error creating the
    * DOM transformer.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return Contains the response to a Create Firewall Rule operation.
    */
    FirewallRuleCreateResponse create(String serverName, FirewallRuleCreateParameters parameters) throws ParserConfigurationException, SAXException, TransformerException, IOException, ServiceException;
    
    /**
    * Adds a new server-level Firewall Rule for an Azure SQL Database Server.
    *
    * @param serverName Required. The name of the Azure SQL Database Server to
    * which this rule will be applied.
    * @param parameters Required. The parameters for the Create Firewall Rule
    * operation.
    * @return Contains the response to a Create Firewall Rule operation.
    */
    Future<FirewallRuleCreateResponse> createAsync(String serverName, FirewallRuleCreateParameters parameters);
    
    /**
    * Deletes a server-level Firewall Rule from an Azure SQL Database Server.
    *
    * @param serverName Required. The name of the Azure SQL Database Server
    * that will have the Firewall Fule removed from it.
    * @param ruleName Required. The name of the Firewall Fule to delete.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse delete(String serverName, String ruleName) throws IOException, ServiceException;
    
    /**
    * Deletes a server-level Firewall Rule from an Azure SQL Database Server.
    *
    * @param serverName Required. The name of the Azure SQL Database Server
    * that will have the Firewall Fule removed from it.
    * @param ruleName Required. The name of the Firewall Fule to delete.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> deleteAsync(String serverName, String ruleName);
    
    /**
    * Returns the Firewall rule for an Azure SQL Database Server with a
    * matching name.
    *
    * @param serverName Required. The name of the Azure SQL Database Server to
    * query for the Firewall Rule.
    * @param ruleName Required. The name of the rule to retrieve.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @return Contains the response from a request to Get Firewall Rule.
    */
    FirewallRuleGetResponse get(String serverName, String ruleName) throws IOException, ServiceException, ParserConfigurationException, SAXException;
    
    /**
    * Returns the Firewall rule for an Azure SQL Database Server with a
    * matching name.
    *
    * @param serverName Required. The name of the Azure SQL Database Server to
    * query for the Firewall Rule.
    * @param ruleName Required. The name of the rule to retrieve.
    * @return Contains the response from a request to Get Firewall Rule.
    */
    Future<FirewallRuleGetResponse> getAsync(String serverName, String ruleName);
    
    /**
    * Returns a list of server-level Firewall Rules for an Azure SQL Database
    * Server.
    *
    * @param serverName Required. The name of the Azure SQL Database Server
    * from which to list the Firewall Rules.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @return Contains the response from a request to List Firewall Rules.
    */
    FirewallRuleListResponse list(String serverName) throws IOException, ServiceException, ParserConfigurationException, SAXException;
    
    /**
    * Returns a list of server-level Firewall Rules for an Azure SQL Database
    * Server.
    *
    * @param serverName Required. The name of the Azure SQL Database Server
    * from which to list the Firewall Rules.
    * @return Contains the response from a request to List Firewall Rules.
    */
    Future<FirewallRuleListResponse> listAsync(String serverName);
    
    /**
    * Updates an existing server-level Firewall Rule for an Azure SQL Database
    * Server.
    *
    * @param serverName Required. The name of the Azure SQL Database Server
    * that has the Firewall Rule to be updated.
    * @param ruleName Required. The name of the Firewall Rule to be updated.
    * @param parameters Required. The parameters for the Update Firewall Rule
    * operation.
    * @throws ParserConfigurationException Thrown if there was an error
    * configuring the parser for the response body.
    * @throws SAXException Thrown if there was an error parsing the response
    * body.
    * @throws TransformerException Thrown if there was an error creating the
    * DOM transformer.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return Represents the firewall rule update response.
    */
    FirewallRuleUpdateResponse update(String serverName, String ruleName, FirewallRuleUpdateParameters parameters) throws ParserConfigurationException, SAXException, TransformerException, IOException, ServiceException;
    
    /**
    * Updates an existing server-level Firewall Rule for an Azure SQL Database
    * Server.
    *
    * @param serverName Required. The name of the Azure SQL Database Server
    * that has the Firewall Rule to be updated.
    * @param ruleName Required. The name of the Firewall Rule to be updated.
    * @param parameters Required. The parameters for the Update Firewall Rule
    * operation.
    * @return Represents the firewall rule update response.
    */
    Future<FirewallRuleUpdateResponse> updateAsync(String serverName, String ruleName, FirewallRuleUpdateParameters parameters);
}