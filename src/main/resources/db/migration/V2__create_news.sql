drop table if exists news;
create table news(id serial primary key ,title varchar,content varchar,
                  date date default current_date,category_id int references news_category(id));