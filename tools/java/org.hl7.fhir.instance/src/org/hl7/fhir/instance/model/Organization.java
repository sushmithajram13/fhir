package org.hl7.fhir.instance.model;

/*
  Copyright (c) 2011-2012, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Sun, Apr 14, 2013 21:55+1000 for FHIR v0.08

import java.util.*;

/**
 * A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action.  Includes companies, institutions, corporations, departments, community groups, healthcare practice groups, etc
 */
public class Organization extends Resource {

    public enum RecordStatus {
        active, // The state representing the fact that the Entity record is currently active.
        inactive, // The state representing the fact that the Entity record is currently inactive.
        Null; // added to help the parsers
        public static RecordStatus fromCode(String codeString) throws Exception {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("active".equals(codeString))
          return active;
        if ("inactive".equals(codeString))
          return inactive;
        throw new Exception("Unknown RecordStatus code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case active: return "active";
            case inactive: return "inactive";
            default: return "?";
          }
        }
    }

  public class RecordStatusEnumFactory implements EnumFactory {
    public Enum<?> fromCode(String codeString) throws Exception {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("active".equals(codeString))
          return RecordStatus.active;
        if ("inactive".equals(codeString))
          return RecordStatus.inactive;
        throw new Exception("Unknown RecordStatus code '"+codeString+"'");
        }
    public String toCode(Enum<?> code) throws Exception {
      if (code == RecordStatus.active)
        return "active";
      if (code == RecordStatus.inactive)
        return "inactive";
      return "?";
      }
    }

    public class OrganizationAccreditationComponent extends Element {
        /**
         * The identifier of the accreditation
         */
        private Identifier identifier;

        /**
         * The type of the accreditation
         */
        private CodeableConcept code;

        /**
         * The organization that conferred/confers the accreditation
         */
        private ResourceReference issuer;

        /**
         * The period for which the accreditation is held
         */
        private Period period;

        public Identifier getIdentifier() { 
          return this.identifier;
        }

        public void setIdentifier(Identifier value) { 
          this.identifier = value;
        }

        public CodeableConcept getCode() { 
          return this.code;
        }

        public void setCode(CodeableConcept value) { 
          this.code = value;
        }

        public ResourceReference getIssuer() { 
          return this.issuer;
        }

        public void setIssuer(ResourceReference value) { 
          this.issuer = value;
        }

        public Period getPeriod() { 
          return this.period;
        }

        public void setPeriod(Period value) { 
          this.period = value;
        }

  }

    public class OrganizationRelatedOrganizationComponent extends Element {
        /**
         * The organization that is related to this organization
         */
        private ResourceReference organization;

        /**
         * Code that specifies how this organization is related to the subject. A code is required.
         */
        private CodeableConcept relation;

        public ResourceReference getOrganization() { 
          return this.organization;
        }

        public void setOrganization(ResourceReference value) { 
          this.organization = value;
        }

        public CodeableConcept getRelation() { 
          return this.relation;
        }

        public void setRelation(CodeableConcept value) { 
          this.relation = value;
        }

  }

    public class OrganizationContactPersonComponent extends Element {
        /**
         * Indicates a purpose for which the person can be contacted.
         */
        private CodeableConcept type;

        /**
         * Details of the contact person
         */
        private Demographics details;

        public CodeableConcept getType() { 
          return this.type;
        }

        public void setType(CodeableConcept value) { 
          this.type = value;
        }

        public Demographics getDetails() { 
          return this.details;
        }

        public void setDetails(Demographics value) { 
          this.details = value;
        }

  }

    /**
     * Identifier for the organization that is used to identify the organization across multiple disparate systems
     */
    private List<Identifier> identifier = new ArrayList<Identifier>();

    /**
     * A name associated with the organization
     */
    private List<String_> name = new ArrayList<String_>();

    /**
     * The kind of organization that this is
     */
    private CodeableConcept type;

    /**
     * An address for the organization
     */
    private List<Address> address = new ArrayList<Address>();

    /**
     * A contact detail for the organization
     */
    private List<Contact> telecom = new ArrayList<Contact>();

    /**
     * Indication of whether this organization's record is still active.
     */
    private Enumeration<RecordStatus> status;

    /**
     * The qualifications/certifications an organization has, including format educational achievements, accreditations and current certifications. All these qualifications may be used to determine what roles the organization may play in a healthcare environment
     */
    private List<OrganizationAccreditationComponent> accreditation = new ArrayList<OrganizationAccreditationComponent>();

    /**
     * Other organizations that are related to this organization. The relationship might be one of several types: sub- or super- orgnizations (i.e. ward in a hospital, owning corporation of a hospital) or partner organizations (i.e. the operating corporation for a hospital)
     */
    private List<OrganizationRelatedOrganizationComponent> relatedOrganization = new ArrayList<OrganizationRelatedOrganizationComponent>();

    /**
     * Contact details for a person acting as a contact for the organization
     */
    private List<OrganizationContactPersonComponent> contactPerson = new ArrayList<OrganizationContactPersonComponent>();

    public List<Identifier> getIdentifier() { 
      return this.identifier;
    }

    public List<String_> getName() { 
      return this.name;
    }

    public CodeableConcept getType() { 
      return this.type;
    }

    public void setType(CodeableConcept value) { 
      this.type = value;
    }

    public List<Address> getAddress() { 
      return this.address;
    }

    public List<Contact> getTelecom() { 
      return this.telecom;
    }

    public Enumeration<RecordStatus> getStatus() { 
      return this.status;
    }

    public void setStatus(Enumeration<RecordStatus> value) { 
      this.status = value;
    }

    public RecordStatus getStatusSimple() { 
      return this.status == null ? null : this.status.getValue();
    }

    public void setStatusSimple(RecordStatus value) { 
      if (value == null)
        this.status = null;
      else {
        if (this.status == null)
          this.status = new Enumeration<RecordStatus>();
        this.status.setValue(value);
      }
    }

    public List<OrganizationAccreditationComponent> getAccreditation() { 
      return this.accreditation;
    }

    public List<OrganizationRelatedOrganizationComponent> getRelatedOrganization() { 
      return this.relatedOrganization;
    }

    public List<OrganizationContactPersonComponent> getContactPerson() { 
      return this.contactPerson;
    }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.Organization;
   }


}

