package org.jboss.additional.testsuite.jdkall.present.management.deploy.runtime.ejb.message;

import org.jboss.eap.additional.testsuite.annotations.EapAdditionalTestsuite;

@EapAdditionalTestsuite({"modules/testcases/jdkAll/Eap7/management/src/main/java","modules/testcases/jdkAll/WildflyRelease/management/src/main/java","modules/testcases/jdkAll/Wildfly/management/src/main/java","modules/testcases/jdkAll/Eap64x/management/src/main/java","modules/testcases/jdkAll/Eap64x-Proposed/management/src/main/java","modules/testcases/jdkAll/Eap63x/management/src/main/java","modules/testcases/jdkAll/Eap62x/management/src/main/java","modules/testcases/jdkAll/Eap61x/management/src/main/java"})
public interface Constants {

    String QUEUE_JNDI_NAME = "queue/org.jboss.as.test.integration.management.deploy.runtime.ejb.message.SimpleMDB-queue";
    String REPLY_MESSAGE_PREFIX = "org.jboss.as.test.integration.management.deploy.runtime.ejb.message.SimpleMDB-queue-reply-prefix";
}
