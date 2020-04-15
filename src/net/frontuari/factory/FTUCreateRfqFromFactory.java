package net.frontuari.factory;

import org.compiere.grid.ICreateFrom;
import org.compiere.grid.ICreateFromFactory;
import org.compiere.model.GridTab;
import org.compiere.model.I_C_RfQ;

import net.frontuari.webui.apps.form.WCreateRfqFromRequisitionUI;

/**
 * 
 * @author Carlos Vargas cvargas@frontuari.net
 *
 */
public class FTUCreateRfqFromFactory implements ICreateFromFactory {
	@Override
	public ICreateFrom create(GridTab mTab) 
	{
		String tableName = mTab.getTableName();
		if (tableName.equals(I_C_RfQ.Table_Name))
			return new WCreateRfqFromRequisitionUI(mTab);
		
		return null;
	}
}

