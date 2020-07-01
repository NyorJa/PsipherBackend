package com.psipher.application.actions;

import com.psipher.application.ddbmodel.UserDDBModel;

/**
 * Add all the required functions for operation such as
 * update, delete, save etc.
 */
public interface UserDetailsOperations {
    /**
     * This will save details for the user whether it is update, create it handles all cases
     * @param userId userId psipher specific
     * @param domain domain like google.com etc
     * @param userAccount account of the user in the domain
     * @param type type of the user account E/P/U
     * @param password password
     * @return status
     */
    String saveDetails(String userId, String domain, String userAccount, String type, String password);

    /**
     * This will create new user if the in the table dont exists
     * @param userId userId psipher specific
     * @param domain domain like google.com etc
     * @param userAccount account of the user in the domain
     * @param type type of the user account E/P/U
     * @param password password
     */
    void createNewUser(String userId, String domain, String userAccount, String type, String password);

    /**
     * updateUser will update the data in the db
     * @param userDDBModel existing data from the dynamodb
     * @param userId userId psipher specific
     * @param domain domain like google.com etc
     * @param userAccount account of the user in the domain
     * @param type type of the user account E/P/U
     * @param password password
     */
    void updateUser(UserDDBModel userDDBModel, String userId, String domain, String userAccount, String type, String password);

}