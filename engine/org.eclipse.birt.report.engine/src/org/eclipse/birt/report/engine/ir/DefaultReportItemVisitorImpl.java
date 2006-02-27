/*******************************************************************************
 * Copyright (c) 2004 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.birt.report.engine.ir;


/**
 * Default implementation for IReportItemVisitor interface
 * 
 * @version $Revision: 1.5 $ $Date: 2005/11/17 16:50:43 $
 */
public class DefaultReportItemVisitorImpl implements IReportItemVisitor
{

	/* (non-Javadoc)
	 * @see org.eclipse.birt.report.engine.ir.IReportItemVisitor#visitFreeFormItem(org.eclipse.birt.report.engine.ir.FreeFormItemDesign)
	 */
	public Object visitFreeFormItem( FreeFormItemDesign container, Object value )
	{
		return visitReportItem(container, value);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.birt.report.engine.ir.IReportItemVisitor#visitListItem(org.eclipse.birt.report.engine.ir.ListItemDesign)
	 */
	public Object visitListItem( ListItemDesign list , Object value)
	{
		return visitReportItem(list, value);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.birt.report.engine.ir.IReportItemVisitor#visitTextItem(org.eclipse.birt.report.engine.ir.TextItemDesign)
	 */
	public Object visitTextItem( TextItemDesign text , Object value)
	{
		return visitReportItem(text, value);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.birt.report.engine.ir.IReportItemVisitor#visitLabelItem(org.eclipse.birt.report.engine.ir.LabelItemDesign)
	 */
	public Object visitLabelItem( LabelItemDesign label , Object value)
	{
		return visitReportItem(label, value);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.birt.report.engine.ir.IReportItemVisitor#visitDataItem(org.eclipse.birt.report.engine.ir.DataItemDesign)
	 */
	public Object visitDataItem( DataItemDesign data , Object value)
	{
		return visitReportItem(data, value);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.birt.report.engine.ir.IReportItemVisitor#visitMultiLineItem(org.eclipse.birt.report.engine.ir.MultiLineItemDesign)
	 */
	public Object visitMultiLineItem( MultiLineItemDesign multiLine , Object value)
	{
		return visitReportItem(multiLine, value);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.birt.report.engine.ir.IReportItemVisitor#visitGridItem(org.eclipse.birt.report.engine.ir.GridItemDesign)
	 */
	public Object visitGridItem( GridItemDesign grid , Object value)
	{
		return visitReportItem(grid, value);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.birt.report.engine.ir.IReportItemVisitor#visitTableItem(org.eclipse.birt.report.engine.ir.TableItemDesign)
	 */
	public Object visitTableItem( TableItemDesign table , Object value)
	{
		return visitReportItem(table, value);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.birt.report.engine.ir.IReportItemVisitor#visitImageItem(org.eclipse.birt.report.engine.ir.ImageItemDesign)
	 */
	public Object visitImageItem( ImageItemDesign image , Object value)
	{
		return visitReportItem(image, value);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.birt.report.engine.ir.IReportItemVisitor#visitExtendedItem(org.eclipse.birt.report.engine.ir.ExtendedItemDesign)
	 */
	public Object visitExtendedItem( ExtendedItemDesign item , Object value)
	{
		return visitReportItem(item, value);
	}
	
	/**
	 * @param item the report item
	 */
	public Object visitReportItem(ReportItemDesign item, Object value)
	{
		return value;
	}
	
	public Object visitRow(RowDesign row, Object value)
	{
		return visitReportItem(row, value);
	}
	
	public Object visitCell(CellDesign cell, Object value)
	{
		return visitReportItem(cell, value);
	}

	public Object visitTemplate( TemplateDesign template, Object value )
	{
		return visitReportItem( template, value );
	}
}
