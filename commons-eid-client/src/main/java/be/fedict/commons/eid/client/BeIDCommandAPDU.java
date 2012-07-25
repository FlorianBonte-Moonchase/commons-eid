/*
 * Commons eID Project.
 * Copyright (C) 2008-2012 FedICT.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version
 * 3.0 as published by the Free Software Foundation.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, see 
 * http://www.gnu.org/licenses/.
 */

package be.fedict.commons.eid.client;

public enum BeIDCommandAPDU {
	SELECT_APPLET_0(0x00, 0xA4, 0x04, 0x0C), SELECT_APPLET_1(0x00, 0xA4, 0x04,
			0x0C), SELECT_FILE(0x00, 0xA4, 0x08, 0x0C), READ_BINARY(0x00, 0xB0), VERIFY_PIN(
			0x00, 0x20, 0x00, 0x01), CHANGE_PIN(0x00, 0x24, 0x00, 0x01), // 0x0024=change reference data 0x0001=user password change
	SELECT_ALGORITHM_AND_PRIVATE_KEY(0x00, 0x22, 0x41, 0xB6), // ISO 7816-8 SET COMMAND (select algorithm and key for signature)
	COMPUTE_DIGITAL_SIGNATURE(0x00, 0x2A, 0x9E, 0x9A), // ISO 7816-8 COMPUTE DIGITAL SIGNATURE COMMAND 
	RESET_PIN(0x00, 0x2C, 0x00, 0x01);

	private final int cla;
	private final int ins;
	private final int p1;
	private final int p2;

	private BeIDCommandAPDU(int cla, int ins, int p1, int p2) {
		this.cla = cla;
		this.ins = ins;
		this.p1 = p1;
		this.p2 = p2;
	}

	private BeIDCommandAPDU(int cla, int ins) {
		this.cla = cla;
		this.ins = ins;
		this.p1 = -1;
		this.p2 = -1;
	}

	public int getCla() {
		return cla;
	}

	public int getIns() {
		return ins;
	}

	public int getP1() {
		return p1;
	}

	public int getP2() {
		return p2;
	}
}
