FROM vsamov/mysql-5.1.73

CMD ["mysqld", "--datadir=/var/lib/mysql", "--user=mysql", "--lower_case_table_names=1", "--max_allowed_packet=128M"]