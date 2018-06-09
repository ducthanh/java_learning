c static void putData(Map<String, Object> param, List<String> checkRows) {

        for (int i = 0; i < checkRows.size(); i++) {

            String[] array = checkRows.get(i).split(DOT);

            Assert.assertEquals(array.length, 3, "checkRow's length not right");

            String key = array[0];

            String value = VelocityUtil.evaluateString(param, array[2]);

            dbCheckCache.put(key, value);

        }

    }
