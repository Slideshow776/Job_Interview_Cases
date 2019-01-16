def fn(v, lst=[]):
    lst.insert(0,v)
    print(lst)
fn(23)
fn(16,[1, 2])
fn([10], [3, 4])
fn([11])