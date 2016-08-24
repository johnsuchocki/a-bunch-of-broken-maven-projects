
package com.project10;

import org.apache.felix.gogo.commands.Command;
import org.apache.karaf.shell.console.OsgiCommandSupport;


/**
 * Displays the last log entries
 */
@Command(scope = "project10", name = "project10", description = "project10")
public class project10 extends OsgiCommandSupport {

    protected Object doExecute() throws Exception {
         System.out.println("Executing command project10");
         return null;
    }
}
