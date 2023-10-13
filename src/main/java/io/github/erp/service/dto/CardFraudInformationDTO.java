package io.github.erp.service.dto;

/*-
 * Erp System - Mark VI No 1 (Phoebe Series) Server ver 1.5.2
 * Copyright © 2021 - 2023 Edwin Njeru (mailnjeru@gmail.com)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link io.github.erp.domain.CardFraudInformation} entity.
 */
public class CardFraudInformationDTO implements Serializable {

    private Long id;

    @NotNull
    private LocalDate reportingDate;

    @NotNull
    @Min(value = 0)
    private Integer totalNumberOfFraudIncidents;

    @NotNull
    @Min(value = 0)
    private Integer valueOfFraudIncedentsInLCY;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getReportingDate() {
        return reportingDate;
    }

    public void setReportingDate(LocalDate reportingDate) {
        this.reportingDate = reportingDate;
    }

    public Integer getTotalNumberOfFraudIncidents() {
        return totalNumberOfFraudIncidents;
    }

    public void setTotalNumberOfFraudIncidents(Integer totalNumberOfFraudIncidents) {
        this.totalNumberOfFraudIncidents = totalNumberOfFraudIncidents;
    }

    public Integer getValueOfFraudIncedentsInLCY() {
        return valueOfFraudIncedentsInLCY;
    }

    public void setValueOfFraudIncedentsInLCY(Integer valueOfFraudIncedentsInLCY) {
        this.valueOfFraudIncedentsInLCY = valueOfFraudIncedentsInLCY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CardFraudInformationDTO)) {
            return false;
        }

        CardFraudInformationDTO cardFraudInformationDTO = (CardFraudInformationDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, cardFraudInformationDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "CardFraudInformationDTO{" +
            "id=" + getId() +
            ", reportingDate='" + getReportingDate() + "'" +
            ", totalNumberOfFraudIncidents=" + getTotalNumberOfFraudIncidents() +
            ", valueOfFraudIncedentsInLCY=" + getValueOfFraudIncedentsInLCY() +
            "}";
    }
}