using System;
using System.Collections.Generic;
using HL7.Fhir.Instance.Support;
using System.Xml.Linq;

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


using HL7.Fhir.Instance.Model;
using System.Xml;

namespace HL7.Fhir.Instance.Parsers
{
    /// <summary>
    /// Parser for code instances
    /// </summary>
    internal static partial class CodeParser
    {
        /// <summary>
        /// Parse code
        /// </summary>
        public static Code<T> ParseCode<T>(IFhirReader reader, ErrorList errors,
                                Code<T> existingInstance = null) where T : struct, IConvertible
        {
            Code<T> result = existingInstance != null ? existingInstance : new Code<T>();

            try
            {
                string currentElementName = reader.CurrentElementName;
                reader.EnterElement();

                while (reader.HasMoreElements())
                {
                    // Parse element contents
                    if (reader.IsAtPrimitiveValueElement())
                        result.Contents = Code<T>.Parse(reader.ReadPrimitiveContents()).Contents;

                    // Parse element extension
                    else if (ParserUtils.IsAtFhirElement(reader, "extension"))
                    {
                        result.Extensions = new List<Extension>();
                        reader.EnterArray();

                        while (ParserUtils.IsAtArrayElement(reader, "extension"))
                            result.Extensions.Add(ExtensionParser.ParseExtension(reader, errors));

                        reader.LeaveArray();
                    }

                    // Parse element internalId
                    else if (reader.IsAtRefIdElement())
                        result.InternalId = Id.Parse(reader.ReadRefIdContents());

                    else
                    {
                        errors.Add(String.Format("Encountered unknown element {0} while parsing {1}", reader.CurrentElementName, currentElementName), reader);
                        reader.SkipSubElementsFor(currentElementName);
                        result = null;
                    }
                }

                reader.LeaveElement();
            }
            catch (Exception ex)
            {
                errors.Add(ex.Message, reader);
            }
            return result;
        }
    }
}