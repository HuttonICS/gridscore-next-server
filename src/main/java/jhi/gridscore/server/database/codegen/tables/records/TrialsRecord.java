/*
 * This file is generated by jOOQ.
 */
package jhi.gridscore.server.database.codegen.tables.records;


import java.time.LocalDateTime;

import jhi.gridscore.server.database.codegen.tables.Trials;
import jhi.gridscore.server.pojo.Trial;
import jhi.gridscore.server.pojo.UpdateStats;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TrialsRecord extends UpdatableRecordImpl<TrialsRecord> implements Record7<String, String, String, Trial, UpdateStats, LocalDateTime, LocalDateTime> {

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
     * Setter for <code>gridscore_db.trials.update_stats</code>.
     */
    public void setUpdateStats(UpdateStats value) {
        set(4, value);
    }

    /**
     * Getter for <code>gridscore_db.trials.update_stats</code>.
     */
    public UpdateStats getUpdateStats() {
        return (UpdateStats) get(4);
    }

    /**
     * Setter for <code>gridscore_db.trials.created_on</code>.
     */
    public void setCreatedOn(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>gridscore_db.trials.created_on</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>gridscore_db.trials.updated_on</code>.
     */
    public void setUpdatedOn(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>gridscore_db.trials.updated_on</code>.
     */
    public LocalDateTime getUpdatedOn() {
        return (LocalDateTime) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, Trial, UpdateStats, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<String, String, String, Trial, UpdateStats, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row7) super.valuesRow();
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
    public Field<UpdateStats> field5() {
        return Trials.TRIALS.UPDATE_STATS;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return Trials.TRIALS.CREATED_ON;
    }

    @Override
    public Field<LocalDateTime> field7() {
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
    public UpdateStats component5() {
        return getUpdateStats();
    }

    @Override
    public LocalDateTime component6() {
        return getCreatedOn();
    }

    @Override
    public LocalDateTime component7() {
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
    public UpdateStats value5() {
        return getUpdateStats();
    }

    @Override
    public LocalDateTime value6() {
        return getCreatedOn();
    }

    @Override
    public LocalDateTime value7() {
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
    public TrialsRecord value5(UpdateStats value) {
        setUpdateStats(value);
        return this;
    }

    @Override
    public TrialsRecord value6(LocalDateTime value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public TrialsRecord value7(LocalDateTime value) {
        setUpdatedOn(value);
        return this;
    }

    @Override
    public TrialsRecord values(String value1, String value2, String value3, Trial value4, UpdateStats value5, LocalDateTime value6, LocalDateTime value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
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
    public TrialsRecord(String ownerCode, String editorCode, String viewerCode, Trial trial, UpdateStats updateStats, LocalDateTime createdOn, LocalDateTime updatedOn) {
        super(Trials.TRIALS);

        setOwnerCode(ownerCode);
        setEditorCode(editorCode);
        setViewerCode(viewerCode);
        setTrial(trial);
        setUpdateStats(updateStats);
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
            setUpdateStats(value.getUpdateStats());
            setCreatedOn(value.getCreatedOn());
            setUpdatedOn(value.getUpdatedOn());
        }
    }
}
