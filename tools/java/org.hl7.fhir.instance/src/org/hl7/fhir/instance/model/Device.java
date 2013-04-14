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

import java.net.*;
/**
 * This resource identifies a manufactured entity that is used in the provision of healthcare. The device may be a machine, an insert, a computer, an application, etc.
 */
public class Device extends Resource {

    public class DeviceIdentityComponent extends Element {
        /**
         * The number assigned to this device by an authorised issuer of Device GITNs
         */
        private String_ gtin;

        /**
         * Lot number of manufacture
         */
        private String_ lot;

        /**
         * The serial number assigned by the organisation when the device was manufactured
         */
        private String_ serialNumber;

        /**
         * Date of expiry of this device (if applicable)
         */
        private Date expiry;

        public String_ getGtin() { 
          return this.gtin;
        }

        public void setGtin(String_ value) { 
          this.gtin = value;
        }

        public String getGtinSimple() { 
          return this.gtin == null ? null : this.gtin.getValue();
        }

        public void setGtinSimple(String value) { 
          if (value == null)
            this.gtin = null;
          else {
            if (this.gtin == null)
              this.gtin = new String_();
            this.gtin.setValue(value);
          }
        }

        public String_ getLot() { 
          return this.lot;
        }

        public void setLot(String_ value) { 
          this.lot = value;
        }

        public String getLotSimple() { 
          return this.lot == null ? null : this.lot.getValue();
        }

        public void setLotSimple(String value) { 
          if (value == null)
            this.lot = null;
          else {
            if (this.lot == null)
              this.lot = new String_();
            this.lot.setValue(value);
          }
        }

        public String_ getSerialNumber() { 
          return this.serialNumber;
        }

        public void setSerialNumber(String_ value) { 
          this.serialNumber = value;
        }

        public String getSerialNumberSimple() { 
          return this.serialNumber == null ? null : this.serialNumber.getValue();
        }

        public void setSerialNumberSimple(String value) { 
          if (value == null)
            this.serialNumber = null;
          else {
            if (this.serialNumber == null)
              this.serialNumber = new String_();
            this.serialNumber.setValue(value);
          }
        }

        public Date getExpiry() { 
          return this.expiry;
        }

        public void setExpiry(Date value) { 
          this.expiry = value;
        }

        public String getExpirySimple() { 
          return this.expiry == null ? null : this.expiry.getValue();
        }

        public void setExpirySimple(String value) { 
          if (value == null)
            this.expiry = null;
          else {
            if (this.expiry == null)
              this.expiry = new Date();
            this.expiry.setValue(value);
          }
        }

  }

    /**
     * Describes what kind of device that this
     */
    private CodeableConcept type;

    /**
     * The name of the manufacturer
     */
    private String_ manufacturer;

    /**
     * The "model" - an identifier assigned by the manufacturer to identify the product by it's type. This number is shared by the all devices sold as the same type
     */
    private String_ model;

    /**
     * The version of the device, if the device has multiple releases under the same model, or if the device is software or carries firmware
     */
    private String_ version;

    /**
     * Universal Device Id fields
     */
    private DeviceIdentityComponent identity;

    /**
     * The organization that is responsible for the provision and ongoing maintenance of the device
     */
    private ResourceReference owner;

    /**
     * Identifiers assigned to this device by various organizations (unless other specific fields exist for them)
     */
    private List<Identifier> assignedId = new ArrayList<Identifier>();

    /**
     * The resource may be found in a literal location (i.e. GPS coordinates), a logical place (i.e. "in/with the patient"), or a coded location
     */
    private ResourceReference location;

    /**
     * If the resource is affixed to a person
     */
    private ResourceReference patient;

    /**
     * Contact details for an organization or a particular human that is responsible for the device
     */
    private List<Contact> contact = new ArrayList<Contact>();

    /**
     * A network address on which the device may be contacted directly
     */
    private Uri url;

    public CodeableConcept getType() { 
      return this.type;
    }

    public void setType(CodeableConcept value) { 
      this.type = value;
    }

    public String_ getManufacturer() { 
      return this.manufacturer;
    }

    public void setManufacturer(String_ value) { 
      this.manufacturer = value;
    }

    public String getManufacturerSimple() { 
      return this.manufacturer == null ? null : this.manufacturer.getValue();
    }

    public void setManufacturerSimple(String value) { 
      if (value == null)
        this.manufacturer = null;
      else {
        if (this.manufacturer == null)
          this.manufacturer = new String_();
        this.manufacturer.setValue(value);
      }
    }

    public String_ getModel() { 
      return this.model;
    }

    public void setModel(String_ value) { 
      this.model = value;
    }

    public String getModelSimple() { 
      return this.model == null ? null : this.model.getValue();
    }

    public void setModelSimple(String value) { 
      if (value == null)
        this.model = null;
      else {
        if (this.model == null)
          this.model = new String_();
        this.model.setValue(value);
      }
    }

    public String_ getVersion() { 
      return this.version;
    }

    public void setVersion(String_ value) { 
      this.version = value;
    }

    public String getVersionSimple() { 
      return this.version == null ? null : this.version.getValue();
    }

    public void setVersionSimple(String value) { 
      if (value == null)
        this.version = null;
      else {
        if (this.version == null)
          this.version = new String_();
        this.version.setValue(value);
      }
    }

    public DeviceIdentityComponent getIdentity() { 
      return this.identity;
    }

    public void setIdentity(DeviceIdentityComponent value) { 
      this.identity = value;
    }

    public ResourceReference getOwner() { 
      return this.owner;
    }

    public void setOwner(ResourceReference value) { 
      this.owner = value;
    }

    public List<Identifier> getAssignedId() { 
      return this.assignedId;
    }

    public ResourceReference getLocation() { 
      return this.location;
    }

    public void setLocation(ResourceReference value) { 
      this.location = value;
    }

    public ResourceReference getPatient() { 
      return this.patient;
    }

    public void setPatient(ResourceReference value) { 
      this.patient = value;
    }

    public List<Contact> getContact() { 
      return this.contact;
    }

    public Uri getUrl() { 
      return this.url;
    }

    public void setUrl(Uri value) { 
      this.url = value;
    }

    public URI getUrlSimple() { 
      return this.url == null ? null : this.url.getValue();
    }

    public void setUrlSimple(URI value) { 
      if (value == null)
        this.url = null;
      else {
        if (this.url == null)
          this.url = new Uri();
        this.url.setValue(value);
      }
    }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.Device;
   }


}

