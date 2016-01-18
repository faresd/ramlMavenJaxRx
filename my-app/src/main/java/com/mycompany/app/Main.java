/*
 * Copyright 2013-2015 (c) MuleSoft, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package com.mycompany.app;

import jersey.repackaged.com.google.common.collect.Sets;
import org.glassfish.jersey.media.multipart.MultiPartFeature;

import javax.ws.rs.core.Application;
import java.util.Set;

/**
 * <p>Main class.</p>
 *
 * @author kor
 * @version $Id: $Id
 */
public class Main extends Application
{

    @Override
    public Set<Class<?>> getClasses() {
        return Sets.newHashSet(
                PresentationResourceImpl.class,
                ProductResourceImpl.class,
                MultiPartFeature.class
        );
    }

}
