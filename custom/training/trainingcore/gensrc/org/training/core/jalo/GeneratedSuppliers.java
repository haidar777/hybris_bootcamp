/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jan 26, 2022, 12:08:56 PM                   ---
 * ----------------------------------------------------------------
 */
package org.training.core.jalo;

import de.hybris.platform.catalog.constants.CatalogConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.PartOfHandler;
import de.hybris.platform.variants.jalo.VariantProduct;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.core.constants.TrainingCoreConstants;
import org.training.core.jalo.City;
import org.training.core.jalo.Province;

/**
 * Generated class for type {@link org.training.core.jalo.Suppliers Suppliers}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedSuppliers extends GenericItem
{
	/** Qualifier of the <code>Suppliers.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Suppliers.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Suppliers.province</code> attribute **/
	public static final String PROVINCE = "province";
	/** Qualifier of the <code>Suppliers.city</code> attribute **/
	public static final String CITY = "city";
	/** Qualifier of the <code>Suppliers.variantProduct</code> attribute **/
	public static final String VARIANTPRODUCT = "variantProduct";
	/**
	* {@link OneToManyHandler} for handling 1:n VARIANTPRODUCT's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<VariantProduct> VARIANTPRODUCTHANDLER = new OneToManyHandler<VariantProduct>(
	CatalogConstants.TC.VARIANTPRODUCT,
	false,
	"suppliers",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(PROVINCE, AttributeMode.INITIAL);
		tmp.put(CITY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Suppliers.city</code> attribute.
	 * @return the city - Suppliers City Code
	 */
	public City getCity(final SessionContext ctx)
	{
		return (City)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Suppliers.city</code> attribute.
	 * @return the city - Suppliers City Code
	 */
	public City getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Suppliers.city</code> attribute. 
	 * @param value the city - Suppliers City Code
	 */
	public void setCity(final SessionContext ctx, final City value)
	{
		new PartOfHandler<City>()
		{
			@Override
			protected City doGetValue(final SessionContext ctx)
			{
				return getCity( ctx );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final City _value)
			{
				final City value = _value;
				setProperty(ctx, CITY,value);
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Suppliers.city</code> attribute. 
	 * @param value the city - Suppliers City Code
	 */
	public void setCity(final City value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Suppliers.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Suppliers.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Suppliers.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Suppliers.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Suppliers.name</code> attribute.
	 * @return the name - Suppliers Name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Suppliers.name</code> attribute.
	 * @return the name - Suppliers Name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Suppliers.name</code> attribute. 
	 * @param value the name - Suppliers Name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Suppliers.name</code> attribute. 
	 * @param value the name - Suppliers Name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Suppliers.province</code> attribute.
	 * @return the province - Suppliers Province Code
	 */
	public Province getProvince(final SessionContext ctx)
	{
		return (Province)getProperty( ctx, PROVINCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Suppliers.province</code> attribute.
	 * @return the province - Suppliers Province Code
	 */
	public Province getProvince()
	{
		return getProvince( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Suppliers.province</code> attribute. 
	 * @param value the province - Suppliers Province Code
	 */
	public void setProvince(final SessionContext ctx, final Province value)
	{
		new PartOfHandler<Province>()
		{
			@Override
			protected Province doGetValue(final SessionContext ctx)
			{
				return getProvince( ctx );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final Province _value)
			{
				final Province value = _value;
				setProperty(ctx, PROVINCE,value);
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Suppliers.province</code> attribute. 
	 * @param value the province - Suppliers Province Code
	 */
	public void setProvince(final Province value)
	{
		setProvince( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Suppliers.variantProduct</code> attribute.
	 * @return the variantProduct
	 */
	public Collection<VariantProduct> getVariantProduct(final SessionContext ctx)
	{
		return VARIANTPRODUCTHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Suppliers.variantProduct</code> attribute.
	 * @return the variantProduct
	 */
	public Collection<VariantProduct> getVariantProduct()
	{
		return getVariantProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Suppliers.variantProduct</code> attribute. 
	 * @param value the variantProduct
	 */
	public void setVariantProduct(final SessionContext ctx, final Collection<VariantProduct> value)
	{
		VARIANTPRODUCTHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Suppliers.variantProduct</code> attribute. 
	 * @param value the variantProduct
	 */
	public void setVariantProduct(final Collection<VariantProduct> value)
	{
		setVariantProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to variantProduct. 
	 * @param value the item to add to variantProduct
	 */
	public void addToVariantProduct(final SessionContext ctx, final VariantProduct value)
	{
		VARIANTPRODUCTHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to variantProduct. 
	 * @param value the item to add to variantProduct
	 */
	public void addToVariantProduct(final VariantProduct value)
	{
		addToVariantProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from variantProduct. 
	 * @param value the item to remove from variantProduct
	 */
	public void removeFromVariantProduct(final SessionContext ctx, final VariantProduct value)
	{
		VARIANTPRODUCTHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from variantProduct. 
	 * @param value the item to remove from variantProduct
	 */
	public void removeFromVariantProduct(final VariantProduct value)
	{
		removeFromVariantProduct( getSession().getSessionContext(), value );
	}
	
}
