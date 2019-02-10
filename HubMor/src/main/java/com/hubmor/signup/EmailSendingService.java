/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hubmor.signup;



public interface EmailSendingService {

	public boolean sendEmail(EmailSending emailSending, String host, String port, final String user, final String pass);

}
