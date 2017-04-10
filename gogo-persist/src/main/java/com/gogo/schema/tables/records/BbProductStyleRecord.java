/**
 * This class is generated by jOOQ
 */
package com.gogo.schema.tables.records;


import com.gogo.schema.tables.BbProductStyle;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


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
public class BbProductStyleRecord extends UpdatableRecordImpl<BbProductStyleRecord> implements Record6<Long, String, Long, Long, Byte, Long> {

    private static final long serialVersionUID = 1067931687;

    /**
     * Setter for <code>bb.bb_product_style.product_style_no</code>.
     */
    public void setProductStyleNo(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>bb.bb_product_style.product_style_no</code>.
     */
    public Long getProductStyleNo() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>bb.bb_product_style.product_style_name</code>.
     */
    public void setProductStyleName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bb.bb_product_style.product_style_name</code>.
     */
    public String getProductStyleName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bb.bb_product_style.create_time</code>.
     */
    public void setCreateTime(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>bb.bb_product_style.create_time</code>.
     */
    public Long getCreateTime() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>bb.bb_product_style.update_time</code>.
     */
    public void setUpdateTime(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>bb.bb_product_style.update_time</code>.
     */
    public Long getUpdateTime() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>bb.bb_product_style.delete_flag</code>. 0-NO,1-YES
     */
    public void setDeleteFlag(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>bb.bb_product_style.delete_flag</code>. 0-NO,1-YES
     */
    public Byte getDeleteFlag() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>bb.bb_product_style.delete_time</code>.
     */
    public void setDeleteTime(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>bb.bb_product_style.delete_time</code>.
     */
    public Long getDeleteTime() {
        return (Long) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, String, Long, Long, Byte, Long> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, String, Long, Long, Byte, Long> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return BbProductStyle.BB_PRODUCT_STYLE.PRODUCT_STYLE_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return BbProductStyle.BB_PRODUCT_STYLE.PRODUCT_STYLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return BbProductStyle.BB_PRODUCT_STYLE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return BbProductStyle.BB_PRODUCT_STYLE.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return BbProductStyle.BB_PRODUCT_STYLE.DELETE_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return BbProductStyle.BB_PRODUCT_STYLE.DELETE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getProductStyleNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getProductStyleName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getDeleteFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getDeleteTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BbProductStyleRecord value1(Long value) {
        setProductStyleNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BbProductStyleRecord value2(String value) {
        setProductStyleName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BbProductStyleRecord value3(Long value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BbProductStyleRecord value4(Long value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BbProductStyleRecord value5(Byte value) {
        setDeleteFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BbProductStyleRecord value6(Long value) {
        setDeleteTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BbProductStyleRecord values(Long value1, String value2, Long value3, Long value4, Byte value5, Long value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BbProductStyleRecord
     */
    public BbProductStyleRecord() {
        super(BbProductStyle.BB_PRODUCT_STYLE);
    }

    /**
     * Create a detached, initialised BbProductStyleRecord
     */
    public BbProductStyleRecord(Long productStyleNo, String productStyleName, Long createTime, Long updateTime, Byte deleteFlag, Long deleteTime) {
        super(BbProductStyle.BB_PRODUCT_STYLE);

        set(0, productStyleNo);
        set(1, productStyleName);
        set(2, createTime);
        set(3, updateTime);
        set(4, deleteFlag);
        set(5, deleteTime);
    }
}