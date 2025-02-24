package com.example.demo.service;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;
import org.springframework.stereotype.Service;

@Service
public class JavaScriptService {

    public String generateChart() {
        String script = """
            (function() {
                var data = [10, 20, 30, 40, 50];
                var svg = '<svg width="500" height="300" style="background-color: #f4f4f4; border: 2px solid #333; border-radius: 10px;">';
                svg += '<defs><linearGradient id="gradient" x1="0%" y1="0%" x2="100%" y2="100%">' +
                       '<stop offset="0%" style="stop-color: #ff7e5f; stop-opacity: 1" />' +
                       '<stop offset="100%" style="stop-color: #feb47b; stop-opacity: 1" />' +
                       '</linearGradient></defs>';
                for (var i = 0; i < data.length; i++) {
                    var x = i * 90 + 30;
                    var height = data[i] * 5;
                    var y = 300 - height;
                    svg += '<rect x="' + x + '" y="' + y + '" width="50" height="' + height + '" fill="url(#gradient)" />';
                }
                svg += '<text x="250" y="20" text-anchor="middle" font-size="20" fill="#333">Data Chart</text>';
                svg += '</svg>';

                return svg;
            })();
        """;

        try (Context context = Context.create()) {
            Value result = context.eval("js", script);
            return result.asString();
        }
    }
}
