package org.jrecruiter.test;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

/**
 * Base class for Dao Test Cases.
 *
 * @author Gunnar Hillert
 * @version $Id$
 */
@ContextConfiguration(
        locations={
                "classpath:/spring/applicationContext.xml",
                "classpath:/spring/applicationContext-jpa.xml",
                "classpath:/spring/test-applicationContext-mail.xml",
                "classpath:/spring/applicationContext-resources.xml",
                "classpath:/spring/applicationContext-security.xml"
                 })
public abstract class BaseTest extends AbstractTransactionalJUnit4SpringContextTests {

    protected @PersistenceContext EntityManager entityManager;
}