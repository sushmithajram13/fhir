package org.hl7.fhir.instance.model;

/*
  Copyright (c) 2011-2013, HL7, Inc.
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

// Generated on Mon, Oct 28, 2013 15:39+1100 for FHIR v0.12

import java.util.*;

/**
 * A supply -  request and provision.
 */
public class Supply extends Resource {

    public static class SupplyDispenseComponent extends BackboneElement {
        /**
         * Identifier assigned by the dispensing facility.   This is an identifier assigned outside FHIR.
         */
        protected Identifier identifier;

        /**
         * A code specifying the state of the dispense event.
         */
        protected Code status;

        /**
         * Indicates the type of dispensing event that is performed. Examples include: Trial Fill, Completion of Trial, Partial Fill, Emergency Fill, Samples, etc.
         */
        protected CodeableConcept type;

        /**
         * The amount of supply that has been dispensed. Includes unit of measure.
         */
        protected Quantity quantity;

        /**
         * Identifies the medication or substance being dispensed. This is either a link to a resource representing the details of the medication or substance or a simple attribute carrying a code that identifies the medication from a known list of medications.
         */
        protected ResourceReference suppliedItem;

        /**
         * The individual reponsible for dispensing the medication.
         */
        protected ResourceReference supplier;

        /**
         * The time the dispense event occurred.
         */
        protected Period whenPrepared;

        /**
         * The time the dispense event occurred.
         */
        protected Period whenHandedOver;

        /**
         * Identification of the facility/location where the Supply was shipped to, as part of the dispense event.
         */
        protected ResourceReference destination;

        /**
         * Identifies the person who picked up the Supply.
         */
        protected List<ResourceReference> receiver = new ArrayList<ResourceReference>();

      public SupplyDispenseComponent() {
        super();
      }

        public Identifier getIdentifier() { 
          return this.identifier;
        }

        public SupplyDispenseComponent setIdentifier(Identifier value) { 
          this.identifier = value;
          return this;
        }

        public Code getStatus() { 
          return this.status;
        }

        public SupplyDispenseComponent setStatus(Code value) { 
          this.status = value;
          return this;
        }

        public String getStatusSimple() { 
          return this.status == null ? null : this.status.getValue();
        }

        public SupplyDispenseComponent setStatusSimple(String value) { 
          if (value == null)
            this.status = null;
          else {
            if (this.status == null)
              this.status = new Code();
            this.status.setValue(value);
          }
          return this;
        }

        public CodeableConcept getType() { 
          return this.type;
        }

        public SupplyDispenseComponent setType(CodeableConcept value) { 
          this.type = value;
          return this;
        }

        public Quantity getQuantity() { 
          return this.quantity;
        }

        public SupplyDispenseComponent setQuantity(Quantity value) { 
          this.quantity = value;
          return this;
        }

        public ResourceReference getSuppliedItem() { 
          return this.suppliedItem;
        }

        public SupplyDispenseComponent setSuppliedItem(ResourceReference value) { 
          this.suppliedItem = value;
          return this;
        }

        public ResourceReference getSupplier() { 
          return this.supplier;
        }

        public SupplyDispenseComponent setSupplier(ResourceReference value) { 
          this.supplier = value;
          return this;
        }

        public Period getWhenPrepared() { 
          return this.whenPrepared;
        }

        public SupplyDispenseComponent setWhenPrepared(Period value) { 
          this.whenPrepared = value;
          return this;
        }

        public Period getWhenHandedOver() { 
          return this.whenHandedOver;
        }

        public SupplyDispenseComponent setWhenHandedOver(Period value) { 
          this.whenHandedOver = value;
          return this;
        }

        public ResourceReference getDestination() { 
          return this.destination;
        }

        public SupplyDispenseComponent setDestination(ResourceReference value) { 
          this.destination = value;
          return this;
        }

        public List<ResourceReference> getReceiver() { 
          return this.receiver;
        }

    // syntactic sugar
        public ResourceReference addReceiver() { 
          ResourceReference t = new ResourceReference();
          this.receiver.add(t);
          return t;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("identifier", "Identifier", "Identifier assigned by the dispensing facility.   This is an identifier assigned outside FHIR.", 0, java.lang.Integer.MAX_VALUE, identifier));
          childrenList.add(new Property("status", "code", "A code specifying the state of the dispense event.", 0, java.lang.Integer.MAX_VALUE, status));
          childrenList.add(new Property("type", "CodeableConcept", "Indicates the type of dispensing event that is performed. Examples include: Trial Fill, Completion of Trial, Partial Fill, Emergency Fill, Samples, etc.", 0, java.lang.Integer.MAX_VALUE, type));
          childrenList.add(new Property("quantity", "Quantity", "The amount of supply that has been dispensed. Includes unit of measure.", 0, java.lang.Integer.MAX_VALUE, quantity));
          childrenList.add(new Property("suppliedItem", "Resource(Medication|Substance|Device)", "Identifies the medication or substance being dispensed. This is either a link to a resource representing the details of the medication or substance or a simple attribute carrying a code that identifies the medication from a known list of medications.", 0, java.lang.Integer.MAX_VALUE, suppliedItem));
          childrenList.add(new Property("supplier", "Resource(Practitioner)", "The individual reponsible for dispensing the medication.", 0, java.lang.Integer.MAX_VALUE, supplier));
          childrenList.add(new Property("whenPrepared", "Period", "The time the dispense event occurred.", 0, java.lang.Integer.MAX_VALUE, whenPrepared));
          childrenList.add(new Property("whenHandedOver", "Period", "The time the dispense event occurred.", 0, java.lang.Integer.MAX_VALUE, whenHandedOver));
          childrenList.add(new Property("destination", "Resource(Location)", "Identification of the facility/location where the Supply was shipped to, as part of the dispense event.", 0, java.lang.Integer.MAX_VALUE, destination));
          childrenList.add(new Property("receiver", "Resource(Practitioner)", "Identifies the person who picked up the Supply.", 0, java.lang.Integer.MAX_VALUE, receiver));
        }

      public SupplyDispenseComponent copy(Supply e) {
        SupplyDispenseComponent dst = new SupplyDispenseComponent();
        dst.identifier = identifier == null ? null : identifier.copy();
        dst.status = status == null ? null : status.copy();
        dst.type = type == null ? null : type.copy();
        dst.quantity = quantity == null ? null : quantity.copy();
        dst.suppliedItem = suppliedItem == null ? null : suppliedItem.copy();
        dst.supplier = supplier == null ? null : supplier.copy();
        dst.whenPrepared = whenPrepared == null ? null : whenPrepared.copy();
        dst.whenHandedOver = whenHandedOver == null ? null : whenHandedOver.copy();
        dst.destination = destination == null ? null : destination.copy();
        dst.receiver = new ArrayList<ResourceReference>();
        for (ResourceReference i : receiver)
          dst.receiver.add(i.copy());
        return dst;
      }

  }

    /**
     * Category of supply.
     */
    protected CodeableConcept name;

    /**
     * Unique identifier for this kind of supply.
     */
    protected Identifier identifier;

    /**
     * Status of the supply.
     */
    protected Code status;

    /**
     * The item which was ordered.
     */
    protected ResourceReference orderedItem;

    /**
     * A link to a resource representing the person to whom the medication will be given.
     */
    protected ResourceReference patient;

    /**
     * Indicates the details of the dispense event such as the days supply and quantity of a supply dispensed.
     */
    protected List<SupplyDispenseComponent> dispense = new ArrayList<SupplyDispenseComponent>();

    public Supply() {
      super();
    }

    public CodeableConcept getName() { 
      return this.name;
    }

    public Supply setName(CodeableConcept value) { 
      this.name = value;
      return this;
    }

    public Identifier getIdentifier() { 
      return this.identifier;
    }

    public Supply setIdentifier(Identifier value) { 
      this.identifier = value;
      return this;
    }

    public Code getStatus() { 
      return this.status;
    }

    public Supply setStatus(Code value) { 
      this.status = value;
      return this;
    }

    public String getStatusSimple() { 
      return this.status == null ? null : this.status.getValue();
    }

    public Supply setStatusSimple(String value) { 
      if (value == null)
        this.status = null;
      else {
        if (this.status == null)
          this.status = new Code();
        this.status.setValue(value);
      }
      return this;
    }

    public ResourceReference getOrderedItem() { 
      return this.orderedItem;
    }

    public Supply setOrderedItem(ResourceReference value) { 
      this.orderedItem = value;
      return this;
    }

    public ResourceReference getPatient() { 
      return this.patient;
    }

    public Supply setPatient(ResourceReference value) { 
      this.patient = value;
      return this;
    }

    public List<SupplyDispenseComponent> getDispense() { 
      return this.dispense;
    }

    // syntactic sugar
    public SupplyDispenseComponent addDispense() { 
      SupplyDispenseComponent t = new SupplyDispenseComponent();
      this.dispense.add(t);
      return t;
    }

      protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("name", "CodeableConcept", "Category of supply.", 0, java.lang.Integer.MAX_VALUE, name));
        childrenList.add(new Property("identifier", "Identifier", "Unique identifier for this kind of supply.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("status", "code", "Status of the supply.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("orderedItem", "Resource(Medication|Substance|Device)", "The item which was ordered.", 0, java.lang.Integer.MAX_VALUE, orderedItem));
        childrenList.add(new Property("patient", "Resource(Patient)", "A link to a resource representing the person to whom the medication will be given.", 0, java.lang.Integer.MAX_VALUE, patient));
        childrenList.add(new Property("dispense", "", "Indicates the details of the dispense event such as the days supply and quantity of a supply dispensed.", 0, java.lang.Integer.MAX_VALUE, dispense));
      }

      public Supply copy() {
        Supply dst = new Supply();
        dst.name = name == null ? null : name.copy();
        dst.identifier = identifier == null ? null : identifier.copy();
        dst.status = status == null ? null : status.copy();
        dst.orderedItem = orderedItem == null ? null : orderedItem.copy();
        dst.patient = patient == null ? null : patient.copy();
        dst.dispense = new ArrayList<SupplyDispenseComponent>();
        for (SupplyDispenseComponent i : dispense)
          dst.dispense.add(i.copy(dst));
        return dst;
      }

      protected Supply typedCopy() {
        return copy();
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.Supply;
   }


}

