/*
 * R : A Computer Language for Statistical Data Analysis
 * Copyright (C) 1995, 1996  Robert Gentleman and Ross Ihaka
 * Copyright (C) 1997--2008  The R Development Core Team
 * Copyright (C) 2003, 2004  The R Foundation
 * Copyright (C) 2010 bedatadriven
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.renjin.primitives.io.serialization;

class SerializationFormat {

  public static final String ASCII_MAGIC_HEADER = "RDA2\n";
  public static final String BINARY_MAGIC_HEADER = "RDB2\n";
  public static final String XDR_MAGIC_HEADER = "RDX2\n";
  
  public static final byte ASCII_FORMAT = 'A';
  public static final byte BINARY_FORMAT = 'B';
  public static final byte XDR_FORMAT = 'X';

  public static final int  WEAKREFSXP = 23;    /* weak reference */
  public static final int  NILVALUE_SXP  =    254 ;
  public static final int  GLOBALENV_SXP  =   253 ;
  public static final int  UNBOUNDVALUE_SXP =  252;
  public static final int  MISSINGARG_SXP =   251;
  public static final int  BASENAMESPACE_SXP= 250;
  public static final int  NAMESPACESXP=      249;
  public static final int  PACKAGESXP  =      248;
  public static final int  PERSISTSXP   =     247;
  /* the following are speculative--we may or may not need them soon */
  public static final int  CLASSREFSXP  =     246;
  public static final int  GENERICREFSXP  =   245;
  public static final int  EMPTYENV_SXP	= 242;
  public static final int  BASEENV_SXP	=  241;

  public static final int BCREPDEF = 244;
  public static final int BCREPREF = 243;
  public static final int ATTRLANGSXP = 240;
  public static final int ATTRLISTSXP = 239;
  

  static final int CE_NATIVE = 0;
  static final int CE_UTF8   = 1;
  static final int CE_LATIN1 = 2;
  static final int CE_SYMBOL = 5;
  static final int CE_ANY    =99;
  static final int LATIN1_MASK  = (1<<2);
  static final int UTF8_MASK = (1<<3);
  static final int CACHED_MASK = (1<<5);
  static final int  HASHASH_MASK =  1;

  public static final int VERSION2 = 2;

}
