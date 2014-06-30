package org.motechproject.mtraining.service;

import org.motechproject.mtraining.domain.ActivityRecord;

import java.util.List;

/**
 * Service interface for managing activity records for a Course
 */
public interface ActivityService {

    /**
     * Add activity for a user (identified by externalId field in the record)
     * @param activityRecord activity to record
     * @return activity record from the operation
     */
    ActivityRecord addActivity(ActivityRecord activityRecord);

    /**
     * Update the activity for a user (set completion time, etc)
     * @param activityRecord activity record to update
     * @return updated activity record
     */
    ActivityRecord updateActivity(ActivityRecord activityRecord);

    /**
     * Get a list of all activity for a user
     * @param externalId Id of the user
     * @return list of activity records
     */
    List<ActivityRecord> findActivityForUser(String externalId);

    /**
     * Get all completed activity for user identified by external id (decided by
     * whether completion time has been set on the record)
     * @param externalId external id of the user
     * @return list of activity records
     */
    List<ActivityRecord> getCompletedActivityForUser(String externalId);

    /**
     * Get a unique user count for activity on a course
     * @param courseName name of the course
     * @return Count of unique users that have accessed the course
     */
    Long getUniqueActivityCountByCourse(String courseName);

    /**
     * Delete the activity by record id
     * @param activityRecordId activity record id to delete
     */
    void deleteActivity(String activityRecordId);

    /**
     * Delete all activity for a user (intended for data cleanups)
     * @param externalId Id of the user
     */
    void deleteActivityForUser(String externalId);
}
