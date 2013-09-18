package com.freshplanet.inapppurchase.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREObject;
import com.freshplanet.inapppurchase.Extension;

public class RestoreTransactionFunction extends BaseFunction
{
	@Override
	public FREObject call(FREContext context, FREObject[] args)
	{
		super.call(context, args);
		
		Extension.context.getIabHelper().queryInventoryAsync(false, Extension.context);
		
		return null;
	}
}