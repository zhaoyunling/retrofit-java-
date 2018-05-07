package org.jsoncloud.hotel.lock.converter;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

public class FastjsonConverterFactory extends Converter.Factory {

    /**
     * Create an instance using a default {@link ObjectMapper} instance for conversion.
     */
    public static FastjsonConverterFactory create() {
        return create(new ObjectMapper());
    }

    /**
     * Create an instance using {@code mapper} for conversion.
     */
    public static FastjsonConverterFactory create(ObjectMapper mapper) {
        return new FastjsonConverterFactory(mapper);
    }

    private final ObjectMapper mapper;

    private FastjsonConverterFactory(ObjectMapper mapper) {
        if (mapper == null) {
            throw new NullPointerException("mapper == null");
        }
        this.mapper = mapper;
    }

    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations,
                                                            Retrofit retrofit) {
        JavaType javaType = mapper.getTypeFactory().constructType(type);
        ObjectReader reader = mapper.reader(javaType);
        return new FastJSONResponseBodyConverter<ResponseBody>(reader);
    }

    @Override
    public Converter<?, RequestBody> requestBodyConverter(Type type,
                                                          Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
        JavaType javaType = mapper.getTypeFactory().constructType(type);
        ObjectWriter writer = mapper.writerWithType(javaType);
        return new FastJSONRequestBodyConverter<RequestBody>(writer);
    }
}