/*
 * Copyright (c) 2002, 2003, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package org.jboss.com.sun.corba.se.spi.ior.iiop;

import org.jboss.com.sun.corba.se.spi.ior.TaggedProfile;
import org.jboss.com.sun.corba.se.spi.ior.iiop.GIOPVersion;
import org.jboss.com.sun.corba.se.spi.orb.ORBVersion;

/**
 * IIOPProfile represents an IIOP tagged profile. It is essentially composed of an object identifier and a template. The
 * template contains all of the IIOP specific information in the profile. Templates are frequently shared between many
 * different profiles, while the object identifiy is unique to each profile.
 */
public interface IIOPProfile extends TaggedProfile
{
    ORBVersion getORBVersion();

    /**
     * Return the servant for this profile, if it is local AND if the OA that implements this objref supports direct
     * access to servants outside of an invocation. XXX move this to the ObjectKeyTemplate
     */
    java.lang.Object getServant();

    /**
     * Return the GIOPVersion of this profile. Caches the result.
     */
    GIOPVersion getGIOPVersion();

    /**
     * Return the Codebase of this profile. Caches the result.
     */
    String getCodebase();
}
