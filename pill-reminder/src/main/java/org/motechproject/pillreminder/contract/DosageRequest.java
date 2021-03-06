package org.motechproject.pillreminder.contract;

import java.util.List;

/**
 * Dosage Request represents Dosage schedule and medicine list for the schedule.
 * startHour and startMinute represent dosage timings.
 * @see MedicineRequest
 */
public class DosageRequest {
    private int startHour;
    private int startMinute;
    private List<MedicineRequest> medicineRequests;

    /**
     * Constructs a request.
     * @param startHour dosage time hour component
     * @param startMinute dosage time minute component
     * @param medicineRequests medicines prescribed for this dose
     */
    public DosageRequest(int startHour, int startMinute, List<MedicineRequest> medicineRequests) {
        this.startHour = startHour;
        this.startMinute = startMinute;
        this.medicineRequests = medicineRequests;
    }

    /**
     * @return medicines prescribed for this dose
     */
    public List<MedicineRequest> getMedicineRequests() {
        return medicineRequests;
    }

    /**
     * @return dosage time minute component
     */
    public int getStartMinute() {
        return startMinute;
    }

    /**
     * @return dosage time hour component
     */
    public int getStartHour() {
        return startHour;
    }
}
