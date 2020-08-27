/**
 * Copyright (c) 2010-2020 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.core.io.transport.serial.rxtx.rfc2217.internal;

import gnu.io.UnsupportedCommOperationException;
import gnu.io.rfc2217.TelnetSerialPort;

/**
 * Wraps the {@link TelnetSerialPort} class to not throw `UnsupportedCommOperationException` on unimplemented methods.
 *
 * @author Hilbrand Bouwkamp - Initial contribution
 */
class SafeTelnetSerialPort extends TelnetSerialPort {

    // Unimplemented methods

    @Override
    public synchronized void enableReceiveThreshold(int threshold) throws UnsupportedCommOperationException {
        // NO-OP
    }

    @Override
    public synchronized void enableReceiveTimeout(int timeout) throws UnsupportedCommOperationException {
        // NO-OP
    }

    @Override
    public synchronized void enableReceiveFraming(int framingByte) throws UnsupportedCommOperationException {
        // NO-OP
    }
}
