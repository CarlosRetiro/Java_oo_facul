package br.com.aula.tarefas.dao;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class LocalDateTimeAttributeConverter implements AttributeConverter<LocalDateTime, Timestamp> {
	
	@Override
	public Timestamp convertToDatabaseColumn(LocalDateTime entityValue) {
		return entityValue == null ? null : java.sql.Timestamp.valueOf(entityValue);
	}

	@Override
	public LocalDateTime convertToEntityAttribute(Timestamp dbValue) {
		return dbValue == null ? null : dbValue.toLocalDateTime(); 
	}
}
