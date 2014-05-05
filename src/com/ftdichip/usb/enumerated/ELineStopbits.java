/*
 * Copyright (C) 2014 Jesse Caulfield <jesse@caulfield.org>.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package com.ftdichip.usb.enumerated;

/**
 * Number of stop bits for ftdi_set_line_property()
 */
public enum ELineStopbits {

  STOP_BIT_1(0), STOP_BIT_15(1), STOP_BIT_2(2);
  private final int stopbit;

  private ELineStopbits(int stopbit) {
    this.stopbit = stopbit;
  }

  public int getStopbit() {
    return stopbit;
  }

}
