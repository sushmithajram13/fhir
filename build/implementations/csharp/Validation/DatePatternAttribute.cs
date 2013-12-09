﻿using Hl7.Fhir.Model;
using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;

namespace Hl7.Fhir.Validation
{
    [AttributeUsage(AttributeTargets.Property, Inherited = false, AllowMultiple = false)]
    public class DatePatternAttribute : ValidationAttribute
    {
        protected override ValidationResult IsValid(object value, ValidationContext validationContext)
        {
            if (validationContext.ObjectType != typeof(string))
                throw new ArgumentException("DatePatternAttribute can only be applied to string properties");

            if(value == null) return ValidationResult.Success;

            if (Regex.IsMatch(value as string, "^" + Date.PATTERN + "$", RegexOptions.Singleline))
                return ValidationResult.Success;
            else
                return new ValidationResult("Not a correctly formatted Date");
        }
    }
}
