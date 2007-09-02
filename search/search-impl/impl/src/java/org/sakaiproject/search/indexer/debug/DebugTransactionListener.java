/**********************************************************************************
 * $URL$
 * $Id$
 ***********************************************************************************
 *
 * Copyright (c) 2003, 2004, 2005, 2006, 2007 The Sakai Foundation.
 *
 * Licensed under the Educational Community License, Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.opensource.org/licenses/ecl1.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 **********************************************************************************/

package org.sakaiproject.search.indexer.debug;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.sakaiproject.search.indexer.api.IndexJournalException;
import org.sakaiproject.search.indexer.api.IndexTransactionException;
import org.sakaiproject.search.indexer.api.IndexUpdateTransaction;
import org.sakaiproject.search.indexer.api.TransactionListener;

/**
 * @author ieb
 *
 */
public class DebugTransactionListener implements TransactionListener
{

	private static final Log log = LogFactory.getLog(DebugTransactionListener.class);

	/**
	 * @see org.sakaiproject.search.indexer.api.TransactionListener#commit(org.sakaiproject.search.indexer.api.IndexUpdateTransaction)
	 */
	public void commit(IndexUpdateTransaction transaction)
			throws IndexTransactionException
	{
		log.info("Commit on Transaction ["+transaction+"]");
	}

	/**
	 * @see org.sakaiproject.search.indexer.api.TransactionListener#open(org.sakaiproject.search.indexer.api.IndexUpdateTransaction)
	 */
	public void open(IndexUpdateTransaction transaction) throws IndexTransactionException
	{
		log.info("Open on Transaction ["+transaction+"]");

	}

	/**
	 * @see org.sakaiproject.search.indexer.api.TransactionListener#prepare(org.sakaiproject.search.indexer.api.IndexUpdateTransaction)
	 */
	public void prepare(IndexUpdateTransaction transaction) throws IndexJournalException
	{
		log.info("Prepare on Transaction ["+transaction+"]");

	}

	/**
	 * @see org.sakaiproject.search.indexer.api.TransactionListener#rollback(org.sakaiproject.search.indexer.api.IndexUpdateTransaction)
	 */
	public void rollback(IndexUpdateTransaction transaction)
			throws IndexTransactionException
	{
		log.info("Rollback on Transaction ["+transaction+"]");

	}

}
