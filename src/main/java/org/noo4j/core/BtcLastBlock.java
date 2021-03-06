/*
 The MIT License (MIT)
 
 Copyright (c) 2013, 2014 by ggbusto@gmx.com

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in all
 copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 SOFTWARE.
 */

package org.noo4j.core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BtcLastBlock implements Serializable {
	private static final long serialVersionUID = 2943476513005471404L;
	private String lastBlock = "";
	private List<BtcTransaction> transactions = new ArrayList<BtcTransaction>();

	public String getLastBlock() {
		return lastBlock;
	}

	public void setLastBlock(String lastBlock) {
		this.lastBlock = BtcUtil.notNull(lastBlock);
	}

	public List<BtcTransaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<BtcTransaction> transactions) {
		this.transactions = BtcUtil.notNull(transactions);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BtcLastBlock [lastBlock=");
		builder.append(lastBlock);
		builder.append(", transactions=");
		builder.append(transactions);
		builder.append("]");
		return builder.toString();
	}
}
