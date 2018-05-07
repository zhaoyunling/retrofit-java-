package org.jsoncloud.hotel.lock.converter;

import com.fasterxml.jackson.databind.ObjectReader;
import okhttp3.ResponseBody;
import retrofit2.Converter;

import java.io.IOException;

/**
 * @author: 文卡<wkwenka@gmail.com>
 */
final class FastJSONResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private final ObjectReader adapter;

    FastJSONResponseBodyConverter(ObjectReader adapter) {
        this.adapter = adapter;
    }

    public T convert(ResponseBody value) throws IOException {
        try {
            return adapter.readValue(value.charStream());
        }
        finally {
            value.close();
        }
    }
}
