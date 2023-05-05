/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sibutils.events;

import java.util.EventListener;
import java.util.EventObject;


public interface EventHandler<T extends EventObject> extends EventListener
{
    void handle(T event);
}
