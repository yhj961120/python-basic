import pymysql

conn = pymysql.connect(host='localhost', 
                        user='root', 
                        password='python', 
                        db='python',
                        charset='utf8',
                        port =3305)

curs = conn.cursor()

sql = """
INSERT INTO emp 
(e_id, e_name, sex, addr) 
VALUES
 (%s, %s, %s, %s)
 """

cnt= curs.execute(sql, ('3','3','3','3'))
print(cnt)

conn.commit()

conn.close