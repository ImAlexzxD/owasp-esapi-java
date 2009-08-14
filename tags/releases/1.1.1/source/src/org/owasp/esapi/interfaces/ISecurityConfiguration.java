/**
 * OWASP Enterprise Security API (ESAPI)
 * 
 * This file is part of the Open Web Application Security Project (OWASP)
 * Enterprise Security API (ESAPI) project. For details, please see
 * http://www.owasp.org/esapi.
 *
 * Copyright (c) 2007 - The OWASP Foundation
 * 
 * The ESAPI is published by OWASP under the LGPL. You should read and accept the
 * LICENSE before you use, modify, and/or redistribute this software.
 * 
 * @author Jeff Williams <a href="http://www.aspectsecurity.com">Aspect Security</a>
 * @created 2007
 */
package org.owasp.esapi.interfaces;

import java.io.File;
import java.util.List;

import org.owasp.esapi.Threshold;

/**
 * The ISecurityConfiguration interface stores all configuration information
 * that directs the behavior of the ESAPI implementation.
 * <P>
 * <img src="doc-files/SecurityConfiguration.jpg" height="600">
 * <P>
 * Protection of this configuration information is critical to the secure
 * operation of the application using the ESAPI. You should use operating system
 * access controls to limit access to wherever the configuration information is
 * stored. Please note that adding another layer of encryption does not make the
 * attackers job much more difficult. Somewhere there must be a master "secret"
 * that is stored unencrypted on the application platform. Creating another
 * layer of indirection doesn't provide any real additional security.
 * 
 * @author Jeff Williams (jeff.williams .at. aspectsecurity.com) <a
 *         href="http://www.aspectsecurity.com">Aspect Security</a>
 * @since June 1, 2007
 */
public interface ISecurityConfiguration {

	/**
	 * Gets the master password.
	 * 
	 * @return the master password
	 */
	public char[] getMasterPassword();

	/**
	 * Gets the keystore.
	 * 
	 * @return the keystore
	 */
	public File getKeystore();

	/**
	 * Gets the master salt.
	 * 
	 * @return the master salt
	 */
	public byte[] getMasterSalt();

	/**
	 * Gets the allowed file extensions.
	 * 
	 * @return the allowed file extensions
	 */
	public List getAllowedFileExtensions();

	/**
	 * Gets the allowed file upload size.
	 * 
	 * @return the allowed file upload size
	 */
	public int getAllowedFileUploadSize();

	/**
	 * Gets the password parameter name.
	 * 
	 * @return the password parameter name
	 */
	public String getPasswordParameterName();

	/**
	 * Gets the username parameter name.
	 * 
	 * @return the username parameter name
	 */
	public String getUsernameParameterName();

	/**
	 * Gets the encryption algorithm.
	 * 
	 * @return the algorithm
	 */
	public String getEncryptionAlgorithm();

	/**
	 * Gets the hasing algorithm.
	 * 
	 * @return the algorithm
	 */
	public String getHashAlgorithm();

	/**
	 * Gets the character encoding.
	 * 
	 * @return encoding name
	 */
	public String getCharacterEncoding();

	/**
	 * Gets the digital signature algorithm.
	 * 
	 * @return encoding name
	 */
	public String getDigitalSignatureAlgorithm();

	/**
	 * Gets the random number generation algorithm.
	 * 
	 * @return encoding name
	 */
	public String getRandomAlgorithm();

	/**
	 * Gets the allowed login attempts.
	 * 
	 * @return the allowed login attempts
	 */
	public int getAllowedLoginAttempts();

	/**
	 * Gets the max old password hashes.
	 * 
	 * @return the max old password hashes
	 */
	public int getMaxOldPasswordHashes();

	/**
	 * Gets an intrusion detection Quota.
	 * 
	 * @param eventName
	 * @return the matching Quota
	 */
	public Threshold getQuota(String eventName);

}