package com.techzonelabs.articles.data;

public class Resource {
    private Resource() {
    }

    public static class Loading extends Resource {
    }

    public static class Success<T> extends Resource {
        private final T result;

        public Success(T result) {
            this.result = result;
        }

        public T getResult() {
            return result;
        }
    }

    public static class Error<T> extends Resource {
        private final T  error;

        public Error(T error) {
            this.error = error;
        }

        public T getError() {
            return error;
        }
    }
}
