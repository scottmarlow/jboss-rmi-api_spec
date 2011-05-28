/*
 * Copyright (c) 1999, Oracle and/or its affiliates. All rights reserved.
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
package org.jboss.com.sun.org.omg.CORBA;

/**
 * org/jboss/com/sun/org/omg/CORBA/ExceptionDescription.java Generated by the IDL-to-Java compiler (portable), version
 * "3.0" from ir.idl Thursday, May 6, 1999 1:51:50 AM PDT
 */

@SuppressWarnings("serial")
public final class ExceptionDescription implements org.omg.CORBA.portable.IDLEntity
{
    public String name = null;

    public String id = null;

    public String defined_in = null;

    public String version = null;

    public org.omg.CORBA.TypeCode type = null;

    public ExceptionDescription()
    {
    } // ctor

    public ExceptionDescription(String _name, String _id, String _defined_in, String _version,
            org.omg.CORBA.TypeCode _type)
    {
        name = _name;
        id = _id;
        defined_in = _defined_in;
        version = _version;
        type = _type;
    } // ctor

} // class ExceptionDescription
