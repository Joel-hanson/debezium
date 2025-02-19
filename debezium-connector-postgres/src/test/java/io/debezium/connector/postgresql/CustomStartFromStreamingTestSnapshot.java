/*
 * Copyright Debezium Authors.
 *
 * Licensed under the Apache Software License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */

package io.debezium.connector.postgresql;

import io.debezium.connector.postgresql.snapshot.query.SelectAllSnapshotQuery;
import io.debezium.spi.snapshot.Snapshotter;

public class CustomStartFromStreamingTestSnapshot extends SelectAllSnapshotQuery implements Snapshotter {

    @Override
    public String name() {
        return CustomStartFromStreamingTestSnapshot.class.getName();
    }

    @Override
    public void validate(boolean offsetContextExists, boolean isSnapshotInProgress) {

    }

    @Override
    public boolean shouldStream() {
        return true;
    }

    @Override
    public boolean shouldSnapshot() {
        return true;
    }

    @Override
    public boolean shouldSnapshotOnSchemaError() {
        return false;
    }

    @Override
    public boolean shouldSnapshotOnDataError() {
        return false;
    }

    @Override
    public boolean shouldSnapshotSchema() {
        return false;
    }

    @Override
    public boolean shouldStreamEventsStartingFromSnapshot() {
        return false;
    }
}
