package kz.bcc.balatime.service;

import kz.bcc.balatime.model.BUser;

public interface IBUserServiceAccess {

    BUser findByLoginIgnoreCase(String login) throws Exception;

    BUser registrationUser(BUser user) throws Exception;

}
