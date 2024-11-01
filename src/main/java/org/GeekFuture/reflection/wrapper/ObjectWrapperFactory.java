/*
 *    Copyright 2009-2012 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.GeekFuture.reflection.wrapper;

import org.GeekFuture.reflection.MetaObject;

/**
 * @author Clinton Begin
 */
/**
 * 对象包装器工厂
 * 
 */
public interface ObjectWrapperFactory {

    //有没有包装器
  boolean hasWrapperFor(Object object);
  
  //得到包装器
  ObjectWrapper getWrapperFor(MetaObject metaObject, Object object);
  
}
