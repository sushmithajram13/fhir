﻿using System;
using System.Collections.Generic;
using Hl7.Fhir.Support;
using System.Xml.Linq;
using System.Linq;

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

//
// Generated on Thu, Aug 8, 2013 08:48+1000 for FHIR v0.10
//

using Hl7.Fhir.Model;
using System.Xml;
using Newtonsoft.Json;
using Hl7.Fhir.Serializers;

namespace Hl7.Fhir.Serializers
{
    /*
    * Serializer for Picture instances
    */
    internal static partial class PictureSerializer
    {
        public static void SerializePicture(Hl7.Fhir.Model.Picture value, IFhirWriter writer, bool summary)
        {
            writer.WriteStartRootObject("Picture");
            writer.WriteStartComplexContent();
            
            // Serialize element _id
            if(value.LocalIdElement != null)
                writer.WritePrimitiveContents("_id", value.LocalIdElement, XmlSerializationHint.Attribute);
            
            // Serialize element extension
            if(value.Extension != null && !summary && value.Extension.Count > 0)
            {
                writer.WriteStartArrayElement("extension");
                foreach(var item in value.Extension)
                {
                    writer.WriteStartArrayMember("extension");
                    ExtensionSerializer.SerializeExtension(item, writer, summary);
                    writer.WriteEndArrayMember();
                }
                writer.WriteEndArrayElement();
            }
            
            // Serialize element language
            if(value.LanguageElement != null && !summary)
            {
                writer.WriteStartElement("language");
                CodeSerializer.SerializeCode(value.LanguageElement, writer, summary);
                writer.WriteEndElement();
            }
            
            // Serialize element text
            if(value.Text != null && !summary)
            {
                writer.WriteStartElement("text");
                NarrativeSerializer.SerializeNarrative(value.Text, writer, summary);
                writer.WriteEndElement();
            }
            
            // Serialize element contained
            if(value.Contained != null && !summary && value.Contained.Count > 0)
            {
                writer.WriteStartArrayElement("contained");
                foreach(var item in value.Contained)
                {
                    writer.WriteStartArrayMember("contained");
                    FhirSerializer.SerializeResource(item, writer, summary);
                    writer.WriteEndArrayMember();
                }
                writer.WriteEndArrayElement();
            }
            
            // Serialize element subject
            if(value.Subject != null)
            {
                writer.WriteStartElement("subject");
                ResourceReferenceSerializer.SerializeResourceReference(value.Subject, writer, summary);
                writer.WriteEndElement();
            }
            
            // Serialize element dateTime
            if(value.DateTimeElement != null)
            {
                writer.WriteStartElement("dateTime");
                FhirDateTimeSerializer.SerializeFhirDateTime(value.DateTimeElement, writer, summary);
                writer.WriteEndElement();
            }
            
            // Serialize element operator
            if(value.Operator != null)
            {
                writer.WriteStartElement("operator");
                ResourceReferenceSerializer.SerializeResourceReference(value.Operator, writer, summary);
                writer.WriteEndElement();
            }
            
            // Serialize element identifier
            if(value.Identifier != null)
            {
                writer.WriteStartElement("identifier");
                IdentifierSerializer.SerializeIdentifier(value.Identifier, writer, summary);
                writer.WriteEndElement();
            }
            
            // Serialize element accessionNo
            if(value.AccessionNo != null)
            {
                writer.WriteStartElement("accessionNo");
                IdentifierSerializer.SerializeIdentifier(value.AccessionNo, writer, summary);
                writer.WriteEndElement();
            }
            
            // Serialize element studyId
            if(value.StudyId != null)
            {
                writer.WriteStartElement("studyId");
                IdentifierSerializer.SerializeIdentifier(value.StudyId, writer, summary);
                writer.WriteEndElement();
            }
            
            // Serialize element seriesId
            if(value.SeriesId != null)
            {
                writer.WriteStartElement("seriesId");
                IdentifierSerializer.SerializeIdentifier(value.SeriesId, writer, summary);
                writer.WriteEndElement();
            }
            
            // Serialize element method
            if(value.Method != null)
            {
                writer.WriteStartElement("method");
                CodeableConceptSerializer.SerializeCodeableConcept(value.Method, writer, summary);
                writer.WriteEndElement();
            }
            
            // Serialize element requester
            if(value.Requester != null)
            {
                writer.WriteStartElement("requester");
                ResourceReferenceSerializer.SerializeResourceReference(value.Requester, writer, summary);
                writer.WriteEndElement();
            }
            
            // Serialize element modality
            if(value.ModalityElement != null)
            {
                writer.WriteStartElement("modality");
                CodeSerializer.SerializeCode<Hl7.Fhir.Model.Picture.PictureType>(value.ModalityElement, writer, summary);
                writer.WriteEndElement();
            }
            
            // Serialize element deviceName
            if(value.DeviceNameElement != null)
            {
                writer.WriteStartElement("deviceName");
                FhirStringSerializer.SerializeFhirString(value.DeviceNameElement, writer, summary);
                writer.WriteEndElement();
            }
            
            // Serialize element height
            if(value.HeightElement != null)
            {
                writer.WriteStartElement("height");
                IntegerSerializer.SerializeInteger(value.HeightElement, writer, summary);
                writer.WriteEndElement();
            }
            
            // Serialize element width
            if(value.WidthElement != null)
            {
                writer.WriteStartElement("width");
                IntegerSerializer.SerializeInteger(value.WidthElement, writer, summary);
                writer.WriteEndElement();
            }
            
            // Serialize element bits
            if(value.BitsElement != null)
            {
                writer.WriteStartElement("bits");
                IntegerSerializer.SerializeInteger(value.BitsElement, writer, summary);
                writer.WriteEndElement();
            }
            
            // Serialize element frames
            if(value.FramesElement != null)
            {
                writer.WriteStartElement("frames");
                IntegerSerializer.SerializeInteger(value.FramesElement, writer, summary);
                writer.WriteEndElement();
            }
            
            // Serialize element frameDelay
            if(value.FrameDelay != null)
            {
                writer.WriteStartElement("frameDelay");
                QuantitySerializer.SerializeQuantity(value.FrameDelay, writer, summary);
                writer.WriteEndElement();
            }
            
            // Serialize element view
            if(value.View != null)
            {
                writer.WriteStartElement("view");
                CodeableConceptSerializer.SerializeCodeableConcept(value.View, writer, summary);
                writer.WriteEndElement();
            }
            
            // Serialize element content
            if(value.Content != null && !summary)
            {
                writer.WriteStartElement("content");
                AttachmentSerializer.SerializeAttachment(value.Content, writer, summary);
                writer.WriteEndElement();
            }
            
            
            writer.WriteEndComplexContent();
            writer.WriteEndRootObject();
        }
        
    }
}