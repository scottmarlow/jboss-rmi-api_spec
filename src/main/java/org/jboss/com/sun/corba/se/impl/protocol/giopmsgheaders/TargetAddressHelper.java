/*
 * Copyright (c) 2000, 2003, Oracle and/or its affiliates. All rights reserved.
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

package org.jboss.com.sun.corba.se.impl.protocol.giopmsgheaders;

/**
 * org/jboss/com/sun/corba/se/impl/protocol/giopmsgheaders/TargetAddressHelper.java Generated by the IDL-to-Java
 * compiler (portable), version "3.0" from src/main/resources/idl/org/jboss/com/sun/corba/se/GiopIDL/g.idl Sunday, June
 * 4, 2000 5:18:54 PM PDT
 */

abstract public class TargetAddressHelper
{
    private static String _id = "IDL:messages/TargetAddress:1.0";

    public static void insert(org.omg.CORBA.Any a, TargetAddress that)
    {
        org.omg.CORBA.portable.OutputStream out = a.create_output_stream();
        a.type(type());
        write(out, that);
        a.read_value(out.create_input_stream(), type());
    }

    public static TargetAddress extract(org.omg.CORBA.Any a)
    {
        return read(a.create_input_stream());
    }

    private static org.omg.CORBA.TypeCode __typeCode = null;

    synchronized public static org.omg.CORBA.TypeCode type()
    {
        if (__typeCode == null)
        {
            org.omg.CORBA.TypeCode _disTypeCode0;
            _disTypeCode0 = org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.tk_short);
            _disTypeCode0 = org.omg.CORBA.ORB.init().create_alias_tc(AddressingDispositionHelper.id(),
                    "AddressingDisposition", _disTypeCode0);
            org.omg.CORBA.UnionMember[] _members0 = new org.omg.CORBA.UnionMember[3];
            org.omg.CORBA.TypeCode _tcOf_members0;
            org.omg.CORBA.Any _anyOf_members0;

            // Branch for object_key
            _anyOf_members0 = org.omg.CORBA.ORB.init().create_any();
            _anyOf_members0.insert_short(KeyAddr.value);
            _tcOf_members0 = org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.tk_octet);
            _tcOf_members0 = org.omg.CORBA.ORB.init().create_sequence_tc(0, _tcOf_members0);
            _members0[0] = new org.omg.CORBA.UnionMember("object_key", _anyOf_members0, _tcOf_members0, null);

            // Branch for profile
            _anyOf_members0 = org.omg.CORBA.ORB.init().create_any();
            _anyOf_members0.insert_short(ProfileAddr.value);
            _tcOf_members0 = org.omg.IOP.TaggedProfileHelper.type();
            _members0[1] = new org.omg.CORBA.UnionMember("profile", _anyOf_members0, _tcOf_members0, null);

            // Branch for ior
            _anyOf_members0 = org.omg.CORBA.ORB.init().create_any();
            _anyOf_members0.insert_short(ReferenceAddr.value);
            _tcOf_members0 = IORAddressingInfoHelper.type();
            _members0[2] = new org.omg.CORBA.UnionMember("ior", _anyOf_members0, _tcOf_members0, null);
            __typeCode = org.omg.CORBA.ORB.init().create_union_tc(TargetAddressHelper.id(), "TargetAddress",
                    _disTypeCode0, _members0);
        }
        return __typeCode;
    }

    public static String id()
    {
        return _id;
    }

    public static TargetAddress read(org.omg.CORBA.portable.InputStream istream)
    {
        TargetAddress value = new TargetAddress();
        short _dis0 = (short) 0;
        _dis0 = istream.read_short();
        switch (_dis0)
        {
            case KeyAddr.value :
                byte _object_key[] = null;
                int _len1 = istream.read_long();
                _object_key = new byte[_len1];
                istream.read_octet_array(_object_key, 0, _len1);
                value.object_key(_object_key);
                break;
            case ProfileAddr.value :
                org.omg.IOP.TaggedProfile _profile = null;
                _profile = org.omg.IOP.TaggedProfileHelper.read(istream);
                value.profile(_profile);
                break;
            case ReferenceAddr.value :
                IORAddressingInfo _ior = null;
                _ior = IORAddressingInfoHelper.read(istream);
                value.ior(_ior);
                break;
            default :
                throw new org.omg.CORBA.BAD_OPERATION();
        }
        return value;
    }

    public static void write(org.omg.CORBA.portable.OutputStream ostream, TargetAddress value)
    {
        ostream.write_short(value.discriminator());
        switch (value.discriminator())
        {
            case KeyAddr.value :
                ostream.write_long(value.object_key().length);
                ostream.write_octet_array(value.object_key(), 0, value.object_key().length);
                break;
            case ProfileAddr.value :
                org.omg.IOP.TaggedProfileHelper.write(ostream, value.profile());
                break;
            case ReferenceAddr.value :
                IORAddressingInfoHelper.write(ostream, value.ior());
                break;
            default :
                throw new org.omg.CORBA.BAD_OPERATION();
        }
    }

}