/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermreviewcodeforpartc;

/**
 *
 * @author Elek
 */
class UserNameValidator {
    public boolean UserNameValidator(String userNameReq) {
        
        String userName = userNameReq;
        
        if (!userName.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
