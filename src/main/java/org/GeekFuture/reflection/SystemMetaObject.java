/*
 * Copyright 2012 MyBatis.org.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.GeekFuture.reflection;

import org.GeekFuture.reflection.factory.DefaultObjectFactory;
import org.GeekFuture.reflection.factory.ObjectFactory;
import org.GeekFuture.reflection.wrapper.DefaultObjectWrapperFactory;
import org.GeekFuture.reflection.wrapper.ObjectWrapperFactory;

/**
 * @author Clinton Begin
 */
/**
 * 一些系统级别的元对象
 *
 */
public final class SystemMetaObject {

  public static final ObjectFactory DEFAULT_OBJECT_FACTORY = new DefaultObjectFactory();
  public static final ObjectWrapperFactory DEFAULT_OBJECT_WRAPPER_FACTORY = new DefaultObjectWrapperFactory();
  public static final MetaObject NULL_META_OBJECT = MetaObject.forObject(NullObject.class, DEFAULT_OBJECT_FACTORY, DEFAULT_OBJECT_WRAPPER_FACTORY);

  private SystemMetaObject() {
    // Prevent Instantiation of Static Class
  }

  //空对象
  private static class NullObject {
  }

  public static MetaObject forObject(Object object) {
    return MetaObject.forObject(object, DEFAULT_OBJECT_FACTORY, DEFAULT_OBJECT_WRAPPER_FACTORY);
  }

}
