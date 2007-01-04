/*
*	http://www.jrecruiter.org
*
*	Disclaimer of Warranty.
*
*	Unless required by applicable law or agreed to in writing, Licensor provides
*	the Work (and each Contributor provides its Contributions) on an "AS IS" BASIS,
*	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied,
*	including, without limitation, any warranties or conditions of TITLE,
*	NON-INFRINGEMENT, MERCHANTABILITY, or FITNESS FOR A PARTICULAR PURPOSE. You are
*	solely responsible for determining the appropriateness of using or
*	redistributing the Work and assume any risks associated with Your exercise of
*	permissions under this License.
*
*/
package org.jrecruiter.dao.hibernate;

import org.jrecruiter.dao.UserRoleDAO;
import org.jrecruiter.model.UserRole;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


/**
 *
 * @author Gunnar Hillert
 * @version $Id: UserRoleDAOHibernate.java 61 2006-11-17 04:40:39Z ghillert $
 */
public class UserRoleDAOHibernate extends HibernateDaoSupport implements UserRoleDAO {


    /**
     * Constructor.
     *
     */
    private UserRoleDAOHibernate() {
        super();
    }

	public UserRole getRole(String roleName) {
		return (UserRole)getHibernateTemplate().get(UserRole.class, roleName);
	}




}
