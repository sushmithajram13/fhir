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
 * A description of a query with a set of parameters.
 */
public class Query extends Resource {

    public enum QueryOutcome {
        ok, // The query was processed successfully.
        limited, // The query was processed successfully, but some additional limitations were added.
        refused, // The server refused to process the query.
        error, // The server tried to process the query, but some error occurred.
        Null; // added to help the parsers
        public static QueryOutcome fromCode(String codeString) throws Exception {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("ok".equals(codeString))
          return ok;
        if ("limited".equals(codeString))
          return limited;
        if ("refused".equals(codeString))
          return refused;
        if ("error".equals(codeString))
          return error;
        throw new Exception("Unknown QueryOutcome code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case ok: return "ok";
            case limited: return "limited";
            case refused: return "refused";
            case error: return "error";
            default: return "?";
          }
        }
    }

  public static class QueryOutcomeEnumFactory implements EnumFactory {
    public Enum<?> fromCode(String codeString) throws Exception {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("ok".equals(codeString))
          return QueryOutcome.ok;
        if ("limited".equals(codeString))
          return QueryOutcome.limited;
        if ("refused".equals(codeString))
          return QueryOutcome.refused;
        if ("error".equals(codeString))
          return QueryOutcome.error;
        throw new Exception("Unknown QueryOutcome code '"+codeString+"'");
        }
    public String toCode(Enum<?> code) throws Exception {
      if (code == QueryOutcome.ok)
        return "ok";
      if (code == QueryOutcome.limited)
        return "limited";
      if (code == QueryOutcome.refused)
        return "refused";
      if (code == QueryOutcome.error)
        return "error";
      return "?";
      }
    }

    public static class QueryResponseComponent extends BackboneElement {
        /**
         * Links response to source query.
         */
        protected Uri identifier;

        /**
         * Outcome of processing the query.
         */
        protected Enumeration<QueryOutcome> outcome;

        /**
         * Total number of matching records.
         */
        protected Integer total;

        /**
         * Parameters server used.
         */
        protected List<Extension> parameter = new ArrayList<Extension>();

        /**
         * To get first page (if paged).
         */
        protected List<Extension> first = new ArrayList<Extension>();

        /**
         * To get previous page (if paged).
         */
        protected List<Extension> previous = new ArrayList<Extension>();

        /**
         * To get next page (if paged).
         */
        protected List<Extension> next = new ArrayList<Extension>();

        /**
         * To get last page (if paged).
         */
        protected List<Extension> last = new ArrayList<Extension>();

        /**
         * Resources that are the results of the search.
         */
        protected List<ResourceReference> reference = new ArrayList<ResourceReference>();

      public QueryResponseComponent() {
        super();
      }

      public QueryResponseComponent(Uri identifier, Enumeration<QueryOutcome> outcome) {
        super();
        this.identifier = identifier;
        this.outcome = outcome;
      }

        public Uri getIdentifier() { 
          return this.identifier;
        }

        public QueryResponseComponent setIdentifier(Uri value) { 
          this.identifier = value;
          return this;
        }

        public String getIdentifierSimple() { 
          return this.identifier == null ? null : this.identifier.getValue();
        }

        public QueryResponseComponent setIdentifierSimple(String value) { 
            if (this.identifier == null)
              this.identifier = new Uri();
            this.identifier.setValue(value);
          return this;
        }

        public Enumeration<QueryOutcome> getOutcome() { 
          return this.outcome;
        }

        public QueryResponseComponent setOutcome(Enumeration<QueryOutcome> value) { 
          this.outcome = value;
          return this;
        }

        public QueryOutcome getOutcomeSimple() { 
          return this.outcome == null ? null : this.outcome.getValue();
        }

        public QueryResponseComponent setOutcomeSimple(QueryOutcome value) { 
            if (this.outcome == null)
              this.outcome = new Enumeration<QueryOutcome>();
            this.outcome.setValue(value);
          return this;
        }

        public Integer getTotal() { 
          return this.total;
        }

        public QueryResponseComponent setTotal(Integer value) { 
          this.total = value;
          return this;
        }

        public int getTotalSimple() { 
          return this.total == null ? null : this.total.getValue();
        }

        public QueryResponseComponent setTotalSimple(int value) { 
          if (value == -1)
            this.total = null;
          else {
            if (this.total == null)
              this.total = new Integer();
            this.total.setValue(value);
          }
          return this;
        }

        public List<Extension> getParameter() { 
          return this.parameter;
        }

    // syntactic sugar
        public Extension addParameter() { 
          Extension t = new Extension();
          this.parameter.add(t);
          return t;
        }

        public List<Extension> getFirst() { 
          return this.first;
        }

    // syntactic sugar
        public Extension addFirst() { 
          Extension t = new Extension();
          this.first.add(t);
          return t;
        }

        public List<Extension> getPrevious() { 
          return this.previous;
        }

    // syntactic sugar
        public Extension addPrevious() { 
          Extension t = new Extension();
          this.previous.add(t);
          return t;
        }

        public List<Extension> getNext() { 
          return this.next;
        }

    // syntactic sugar
        public Extension addNext() { 
          Extension t = new Extension();
          this.next.add(t);
          return t;
        }

        public List<Extension> getLast() { 
          return this.last;
        }

    // syntactic sugar
        public Extension addLast() { 
          Extension t = new Extension();
          this.last.add(t);
          return t;
        }

        public List<ResourceReference> getReference() { 
          return this.reference;
        }

    // syntactic sugar
        public ResourceReference addReference() { 
          ResourceReference t = new ResourceReference();
          this.reference.add(t);
          return t;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("identifier", "uri", "Links response to source query.", 0, java.lang.Integer.MAX_VALUE, identifier));
          childrenList.add(new Property("outcome", "code", "Outcome of processing the query.", 0, java.lang.Integer.MAX_VALUE, outcome));
          childrenList.add(new Property("total", "integer", "Total number of matching records.", 0, java.lang.Integer.MAX_VALUE, total));
          childrenList.add(new Property("parameter", "Extension", "Parameters server used.", 0, java.lang.Integer.MAX_VALUE, parameter));
          childrenList.add(new Property("first", "Extension", "To get first page (if paged).", 0, java.lang.Integer.MAX_VALUE, first));
          childrenList.add(new Property("previous", "Extension", "To get previous page (if paged).", 0, java.lang.Integer.MAX_VALUE, previous));
          childrenList.add(new Property("next", "Extension", "To get next page (if paged).", 0, java.lang.Integer.MAX_VALUE, next));
          childrenList.add(new Property("last", "Extension", "To get last page (if paged).", 0, java.lang.Integer.MAX_VALUE, last));
          childrenList.add(new Property("reference", "Resource(Any)", "Resources that are the results of the search.", 0, java.lang.Integer.MAX_VALUE, reference));
        }

      public QueryResponseComponent copy(Query e) {
        QueryResponseComponent dst = new QueryResponseComponent();
        dst.identifier = identifier == null ? null : identifier.copy();
        dst.outcome = outcome == null ? null : outcome.copy();
        dst.total = total == null ? null : total.copy();
        dst.parameter = new ArrayList<Extension>();
        for (Extension i : parameter)
          dst.parameter.add(i.copy());
        dst.first = new ArrayList<Extension>();
        for (Extension i : first)
          dst.first.add(i.copy());
        dst.previous = new ArrayList<Extension>();
        for (Extension i : previous)
          dst.previous.add(i.copy());
        dst.next = new ArrayList<Extension>();
        for (Extension i : next)
          dst.next.add(i.copy());
        dst.last = new ArrayList<Extension>();
        for (Extension i : last)
          dst.last.add(i.copy());
        dst.reference = new ArrayList<ResourceReference>();
        for (ResourceReference i : reference)
          dst.reference.add(i.copy());
        return dst;
      }

  }

    /**
     * Links query and its response(s).
     */
    protected Uri identifier;

    /**
     * Set of query parameters with values.
     */
    protected List<Extension> parameter = new ArrayList<Extension>();

    /**
     * If this is a response to a query.
     */
    protected QueryResponseComponent response;

    public Query() {
      super();
    }

    public Query(Uri identifier) {
      super();
      this.identifier = identifier;
    }

    public Uri getIdentifier() { 
      return this.identifier;
    }

    public Query setIdentifier(Uri value) { 
      this.identifier = value;
      return this;
    }

    public String getIdentifierSimple() { 
      return this.identifier == null ? null : this.identifier.getValue();
    }

    public Query setIdentifierSimple(String value) { 
        if (this.identifier == null)
          this.identifier = new Uri();
        this.identifier.setValue(value);
      return this;
    }

    public List<Extension> getParameter() { 
      return this.parameter;
    }

    // syntactic sugar
    public Extension addParameter() { 
      Extension t = new Extension();
      this.parameter.add(t);
      return t;
    }

    public QueryResponseComponent getResponse() { 
      return this.response;
    }

    public Query setResponse(QueryResponseComponent value) { 
      this.response = value;
      return this;
    }

      protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "uri", "Links query and its response(s).", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("parameter", "Extension", "Set of query parameters with values.", 0, java.lang.Integer.MAX_VALUE, parameter));
        childrenList.add(new Property("response", "", "If this is a response to a query.", 0, java.lang.Integer.MAX_VALUE, response));
      }

      public Query copy() {
        Query dst = new Query();
        dst.identifier = identifier == null ? null : identifier.copy();
        dst.parameter = new ArrayList<Extension>();
        for (Extension i : parameter)
          dst.parameter.add(i.copy());
        dst.response = response == null ? null : response.copy(dst);
        return dst;
      }

      protected Query typedCopy() {
        return copy();
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.Query;
   }


}

