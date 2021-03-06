/**
 * This class is generated by jOOQ
 */
package com.gogo.schema.tables;


import com.gogo.schema.Bb;
import com.gogo.schema.Keys;
import com.gogo.schema.tables.records.BbOrderItemRecord;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BbOrderItem extends TableImpl<BbOrderItemRecord> {

    private static final long serialVersionUID = -2033857604;

    /**
     * The reference instance of <code>bb.bb_order_item</code>
     */
    public static final BbOrderItem BB_ORDER_ITEM = new BbOrderItem();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BbOrderItemRecord> getRecordType() {
        return BbOrderItemRecord.class;
    }

    /**
     * The column <code>bb.bb_order_item.order_item_no</code>.
     */
    public final TableField<BbOrderItemRecord, Long> ORDER_ITEM_NO = createField("order_item_no", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>bb.bb_order_item.order_no</code>.
     */
    public final TableField<BbOrderItemRecord, Long> ORDER_NO = createField("order_no", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>bb.bb_order_item.product_no</code>.
     */
    public final TableField<BbOrderItemRecord, Long> PRODUCT_NO = createField("product_no", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>bb.bb_order_item.product_style_no</code>.
     */
    public final TableField<BbOrderItemRecord, Long> PRODUCT_STYLE_NO = createField("product_style_no", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>bb.bb_order_item.product_name</code>.
     */
    public final TableField<BbOrderItemRecord, String> PRODUCT_NAME = createField("product_name", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>bb.bb_order_item.product_style_name</code>.
     */
    public final TableField<BbOrderItemRecord, String> PRODUCT_STYLE_NAME = createField("product_style_name", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>bb.bb_order_item.price</code>.
     */
    public final TableField<BbOrderItemRecord, BigDecimal> PRICE = createField("price", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2).nullable(false), this, "");

    /**
     * The column <code>bb.bb_order_item.quantity</code>.
     */
    public final TableField<BbOrderItemRecord, Integer> QUANTITY = createField("quantity", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bb.bb_order_item.total_amount</code>.
     */
    public final TableField<BbOrderItemRecord, BigDecimal> TOTAL_AMOUNT = createField("total_amount", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2).nullable(false), this, "");

    /**
     * The column <code>bb.bb_order_item.create_time</code>.
     */
    public final TableField<BbOrderItemRecord, Long> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>bb.bb_order_item.update_time</code>.
     */
    public final TableField<BbOrderItemRecord, Long> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>bb.bb_order_item.delete_flag</code>. 0-NO,1-YES
     */
    public final TableField<BbOrderItemRecord, Byte> DELETE_FLAG = createField("delete_flag", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "0-NO,1-YES");

    /**
     * The column <code>bb.bb_order_item.delete_time</code>.
     */
    public final TableField<BbOrderItemRecord, Long> DELETE_TIME = createField("delete_time", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>bb.bb_order_item</code> table reference
     */
    public BbOrderItem() {
        this("bb_order_item", null);
    }

    /**
     * Create an aliased <code>bb.bb_order_item</code> table reference
     */
    public BbOrderItem(String alias) {
        this(alias, BB_ORDER_ITEM);
    }

    private BbOrderItem(String alias, Table<BbOrderItemRecord> aliased) {
        this(alias, aliased, null);
    }

    private BbOrderItem(String alias, Table<BbOrderItemRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Bb.BB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BbOrderItemRecord> getPrimaryKey() {
        return Keys.KEY_BB_ORDER_ITEM_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BbOrderItemRecord>> getKeys() {
        return Arrays.<UniqueKey<BbOrderItemRecord>>asList(Keys.KEY_BB_ORDER_ITEM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BbOrderItem as(String alias) {
        return new BbOrderItem(alias, this);
    }

    /**
     * Rename this table
     */
    public BbOrderItem rename(String name) {
        return new BbOrderItem(name, null);
    }
}
