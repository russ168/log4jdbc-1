/*
 * This file is part of Log4Jdbc.
 *
 * Log4Jdbc is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Log4Jdbc is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Log4Jdbc.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package fr.ms.log4jdbc.datasource;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @see <a href="http://marcosemiao4j.wordpress.com">Marco4J</a>
 *
 *
 * @author Marco Semiao
 *
 */
public abstract class AbstractRewriteDataSource extends AbstractDataSource {

	public void setURL(final String url) {
		invokeMethod("setURL", url);
	}

	public String getURL() {
		return (String) invokeMethod("getURL");
	}

	public void setDriverType(final int driverType) {
		invokeMethod("setDriverType", new Integer(driverType), Integer.TYPE);
	}

	public int getDriverType() {
		final Integer value = (Integer) invokeMethod("getDriverType", null, Integer.TYPE);
		return value.intValue();
	}

	public void setDatabaseName(final String databaseName) {
		invokeMethod("setDatabaseName", databaseName);
	}

	public String getDatabaseName() {
		return (String) invokeMethod("getDatabaseName");
	}

	public void setDataSourceName(final String dataSourceName) {
		invokeMethod("setDataSourceName", dataSourceName);
	}

	public String getDataSourceName() {
		return (String) invokeMethod("getDataSourceName");
	}

	public void setPortNumber(final int portNumber) {
		invokeMethod("setPortNumber", new Integer(portNumber), Integer.TYPE);
	}

	public int getPortNumber() {
		final Integer value = (Integer) invokeMethod("getPortNumber", null, Integer.TYPE);
		return value.intValue();
	}

	public void setServerName(final String serverName) {
		invokeMethod("setServerName", serverName);
	}

	public String getServerName() {
		return (String) invokeMethod("getServerName");
	}

	public void setUser(final String user) {
		invokeMethod("setUser", user);
	}

	public String getUser() {
		return (String) invokeMethod("getUser");
	}

	public void setPassword(final String password) {
		invokeMethod("setPassword", password);
	}

	public String getPassword() {
		return (String) invokeMethod("getPassword");
	}

	public Properties getProperties() throws SQLException {
		return (Properties) invokeMethod("getProperties");
	}

	public Properties getProperties(final boolean paramBoolean) throws SQLException {
		return (Properties) invokeMethod("getProperties", new Boolean(paramBoolean), Boolean.TYPE);
	}

	public void setDescription(final String description) {
		invokeMethod("setDescription", description);
	}

	public String getDescription() {
		return (String) invokeMethod("getDescription");
	}

	public void setTraceDirectory(final String traceDirectory) {
		invokeMethod("setTraceDirectory", traceDirectory);
	}

	public String getTraceDirectory() {
		return (String) invokeMethod("getTraceDirectory");
	}

	public void setTraceFile(final String traceFile) {
		invokeMethod("setTraceFile", traceFile);
	}

	public String getTraceFile() {
		return (String) invokeMethod("getTraceFile");
	}

	public void setTraceFileAppend(final boolean traceFileAppend) {
		invokeMethod("setTraceFileAppend", new Boolean(traceFileAppend), Boolean.TYPE);
	}

	public boolean getTraceFileAppend() {
		final Boolean value = (Boolean) invokeMethod("getTraceFileAppend", null, Boolean.TYPE);
		return value.booleanValue();
	}

	public void setTraceLevel(final int traceLevel) {
		invokeMethod("setTraceLevel", new Integer(traceLevel), Integer.TYPE);
	}

	public int getTraceLevel() {
		final Integer value = (Integer) invokeMethod("getTraceLevel", null, Integer.TYPE);
		return value.intValue();
	}

	public void setEnableT2zosLBF(final int enableT2zosLBF) {
		invokeMethod("setEnableT2zosLBF", new Integer(enableT2zosLBF), Integer.TYPE);
	}

	public int getEnableT2zosLBF() {
		final Integer value = (Integer) invokeMethod("getEnableT2zosLBF", null, Integer.TYPE);
		return value.intValue();
	}

	public synchronized void setEnableT2zosLBFSPResultSets(final int enableT2zosLBFSPResultSets) {
		invokeMethod("setEnableT2zosLBFSPResultSets", new Integer(enableT2zosLBFSPResultSets), Integer.TYPE);
	}

	public int getEnableT2zosLBFSPResultSets() {
		final Integer value = (Integer) invokeMethod("getEnableT2zosLBFSPResultSets", null, Integer.TYPE);
		return value.intValue();
	}

	public void setEnableT2zosCallSPBundling(final int enableT2zosCallSPBundling) {
		invokeMethod("setEnableT2zosCallSPBundling", new Integer(enableT2zosCallSPBundling), Integer.TYPE);
	}

	public int getEnableT2zosCallSPBundling() {
		final Integer value = (Integer) invokeMethod("getEnableT2zosCallSPBundling", null, Integer.TYPE);
		return value.intValue();
	}

	public void setDowngradeHoldCursorsUnderXa(final boolean downgradeHoldCursorsUnderXa) {
		invokeMethod("setDowngradeHoldCursorsUnderXa", new Boolean(downgradeHoldCursorsUnderXa), Boolean.TYPE);
	}

	public boolean getDowngradeHoldCursorsUnderXa() {
		final Boolean value = (Boolean) invokeMethod("getDowngradeHoldCursorsUnderXa", null, Boolean.TYPE);
		return value.booleanValue();
	}

	public synchronized void setAccountingInterval(final String accountingInterval) {
		invokeMethod("setAccountingInterval", accountingInterval);
	}

	public String getAccountingInterval() {
		return (String) invokeMethod("getAccountingInterval");
	}

	public void setKerberosServerPrincipal(final String kerberosServerPrincipal) {
		invokeMethod("setKerberosServerPrincipal", kerberosServerPrincipal);
	}

	public String getKerberosServerPrincipal() {
		return (String) invokeMethod("getKerberosServerPrincipal");
	}

	public void setPkList(final String pkList) {
		invokeMethod("setPkList", pkList);
	}

	public String getPkList() {
		return (String) invokeMethod("getPkList");
	}

	public void setPlanName(final String planName) {
		invokeMethod("setPlanName", planName);
	}

	public String getPlanName() {
		return (String) invokeMethod("getPlanName");
	}

	public void setReadOnly(final boolean readOnly) {
		invokeMethod("setReadOnly", new Boolean(readOnly), Boolean.TYPE);
	}

	public boolean getReadOnly() {
		final Boolean value = (Boolean) invokeMethod("getReadOnly", null, Boolean.TYPE);
		return value.booleanValue();
	}

	public void setSecurityMechanism(final short securityMechanism) {
		invokeMethod("setSecurityMechanism", new Short(securityMechanism), Short.TYPE);
	}

	public short getSecurityMechanism() {
		final Short value = (Short) invokeMethod("getSecurityMechanism", null, Short.TYPE);
		return value.shortValue();
	}

	public void setSqljEnableClassLoaderSpecificProfiles(final boolean sqljEnableClassLoaderSpecificProfiles) {
		invokeMethod("setSqljEnableClassLoaderSpecificProfiles", new Boolean(sqljEnableClassLoaderSpecificProfiles),
				Boolean.TYPE);
	}

	public boolean getSqljEnableClassLoaderSpecificProfiles(final Properties paramProperties) {
		final Boolean value = (Boolean) invokeMethod("getSqljEnableClassLoaderSpecificProfiles", paramProperties,
				Boolean.TYPE);
		return value.booleanValue();
	}

	public void setDefaultIsolationLevel(final int level) {
		invokeMethod("setDefaultIsolationLevel", new Integer(level), Integer.TYPE);
	}

	public int getDefaultIsolationLevel() {
		final Integer value = (Integer) invokeMethod("getDefaultIsolationLevel", null, Integer.TYPE);
		return value.intValue();
	}

	private void writeObject(final ObjectOutputStream oos) throws IOException {
		invokeMethod("writeObject", oos);
	}

	private void readObject(final ObjectInputStream ois) throws IOException, ClassNotFoundException {
		invokeMethod("readObject", ois);
	}
}
