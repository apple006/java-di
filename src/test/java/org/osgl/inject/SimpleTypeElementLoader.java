package org.osgl.inject;

import org.osgl.inject.loader.TypedElementLoader;
import org.osgl.util.C;

import java.util.List;

/**
 * Emulate Type discovery mechanism in IoC container
 */
public class SimpleTypeElementLoader extends TypedElementLoader {
    @Override
    protected List<Class> load(Class type, boolean loadNonPublic, boolean loadAbstract, boolean loadRoot) {
        if (type == ErrorHandler.class) {
            return (List)C.list(NotFoundHandler.class, InternalErrorHandler.class);
        }
        return C.list();
    }

}
