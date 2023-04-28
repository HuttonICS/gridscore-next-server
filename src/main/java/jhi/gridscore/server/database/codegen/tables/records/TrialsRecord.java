/*
 * This file is generated by jOOQ.
 */
package jhi.gridscore.server.database.codegen.tables.records;


import java.time.LocalDateTime;

import jhi.gridscore.server.database.codegen.tables.Trials;
import jhi.gridscore.server.pojo.Trial;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TrialsRecord extends UpdatableRecordImpl<TrialsRecord> implements Record6<String, String, String, Trial, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>gridscore_db.trials.owner_code</code>.
     */
    public void setOwnerCode(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>gridscore_db.trials.owner_code</code>.
     */
    public String getOwnerCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>gridscore_db.trials.editor_code</code>.
     */
    public void setEditorCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>gridscore_db.trials.editor_code</code>.
     */
    public String getEditorCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>gridscore_db.trials.viewer_code</code>.
     */
    public void setViewerCode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>gridscore_db.trials.viewer_code</code>.
     */
    public String getViewerCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>gridscore_db.trials.trial</code>.
     */
    public void setTrial(Trial value) {
        set(3, value);
    }

    /**
     * Getter for <code>gridscore_db.trials.trial</code>.
     */
    public Trial getTrial() {
        return (Trial) get(3);
    }

    /**
     * Setter for <code>gridscore_db.trials.created_on</code>.
     */
    public void setCreatedOn(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>gridscore_db.trials.created_on</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>gridscore_db.trials.updated_on</code>.
     */
    public void setUpdatedOn(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>gridscore_db.trials.updated_on</code>.
     */
    public LocalDateTime getUpdatedOn() {
        return (LocalDateTime) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, String, Trial, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<String, String, String, Trial, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Trials.TRIALS.OWNER_CODE;
    }

    @Override
    public Field<String> field2() {
        return Trials.TRIALS.EDITOR_CODE;
    }

    @Override
    public Field<String> field3() {
        return Trials.TRIALS.VIEWER_CODE;
    }

    @Override
    public Field<Trial> field4() {
        return Trials.TRIALS.TRIAL;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return Trials.TRIALS.CREATED_ON;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return Trials.TRIALS.UPDATED_ON;
    }

    @Override
    public String component1() {
        return getOwnerCode();
    }

    @Override
    public String component2() {
        return getEditorCode();
    }

    @Override
    public String component3() {
        return getViewerCode();
    }

    @Override
    public Trial component4() {
        return getTrial();
    }

    @Override
    public LocalDateTime component5() {
        return getCreatedOn();
    }

    @Override
    public LocalDateTime component6() {
        return getUpdatedOn();
    }

    @Override
    public String value1() {
        return getOwnerCode();
    }

    @Override
    public String value2() {
        return getEditorCode();
    }

    @Override
    public String value3() {
        return getViewerCode();
    }

    @Override
    public Trial value4() {
        return getTrial();
    }

    @Override
    public LocalDateTime value5() {
        return getCreatedOn();
    }

    @Override
    public LocalDateTime value6() {
        return getUpdatedOn();
    }

    @Override
    public TrialsRecord value1(String value) {
        setOwnerCode(value);
        return this;
    }

    @Override
    public TrialsRecord value2(String value) {
        setEditorCode(value);
        return this;
    }

    @Override
    public TrialsRecord value3(String value) {
        setViewerCode(value);
        return this;
    }

    @Override
    public TrialsRecord value4(Trial value) {
        setTrial(value);
        return this;
    }

    @Override
    public TrialsRecord value5(LocalDateTime value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public TrialsRecord value6(LocalDateTime value) {
        setUpdatedOn(value);
        return this;
    }

    @Override
    public TrialsRecord values(String value1, String value2, String value3, Trial value4, LocalDateTime value5, LocalDateTime value6) {
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
     * Create a detached TrialsRecord
     */
    public TrialsRecord() {
        super(Trials.TRIALS);
    }

    /**
     * Create a detached, initialised TrialsRecord
     */
    public TrialsRecord(String ownerCode, String editorCode, String viewerCode, Trial trial, LocalDateTime createdOn, LocalDateTime updatedOn) {
        super(Trials.TRIALS);

        setOwnerCode(ownerCode);
        setEditorCode(editorCode);
        setViewerCode(viewerCode);
        setTrial(trial);
        setCreatedOn(createdOn);
        setUpdatedOn(updatedOn);
    }

    /**
     * Create a detached, initialised TrialsRecord
     */
    public TrialsRecord(jhi.gridscore.server.database.codegen.tables.pojos.Trials value) {
        super(Trials.TRIALS);

        if (value != null) {
            setOwnerCode(value.getOwnerCode());
            setEditorCode(value.getEditorCode());
            setViewerCode(value.getViewerCode());
            setTrial(value.getTrial());
            setCreatedOn(value.getCreatedOn());
            setUpdatedOn(value.getUpdatedOn());
        }
    }
}
